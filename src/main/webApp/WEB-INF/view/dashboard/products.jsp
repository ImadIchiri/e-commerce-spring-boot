<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %> <%@include
file="/WEB-INF/view/shared/headerAndLefNav.jsp" %>

<section class="container py-5">
  <!-- Search By Title -->
  <div class="row ms-auto" style="width: fit-content">
    <form action="/dashboard/products" method="get">
      <div class="w-fit d-flex align-items-end mb-3 ms-auto">
        <div class="ps-0 me-2">
          <label for="title" class="form-label">Title</label>
          <input
            type="text"
            name="title"
            class="form-control"
            value="${title}"
          />
        </div>
        <button type="submit" class="btn btn-primary mt-2 mt-md-0">
          Search
        </button>
      </div>
      <div class="dropdown col-12 col-md-8 mx-auto">
        <a
          class="btn btn-secondary dropdown-toggle"
          href="#"
          role="button"
          data-bs-toggle="dropdown"
          aria-expanded="false"
        >
          Category
        </a>

        <ul class="dropdown-menu">
          <li>
            <a class="dropdown-item" href="/dashboard/products">All Products</a>
          </li>
          <c:forEach var="category" items="${categories}">
            <li>
              <a
                class="dropdown-item"
                href="/dashboard/products/${category.getCategorie()}"
              >
                <c:out value="${category.getCategorie()}" />
              </a>
            </li>
          </c:forEach>
        </ul>
      </div>
    </form>
  </div>
  <div class="row">
    <div class="table-responsive col-12 mx-auto">
      <table class="table">
        <thead>
          <tr>
            <!-- <th scope="col">#</th> -->
            <th scope="col">Image</th>
            <th scope="col">Titre</th>
            <th scope="col">Prix</th>
            <th scope="col" title="Quantite Disponible">Q.D</th>
            <th scope="col">Categorie</th>
            <th scope="col">Actions</th>
          </tr>
        </thead>
        <tbody>
          <c:forEach var="product" items="${products}">
            <tr>
              <td>
                <img
                  src="/images/products/${product.getImageName()}.webp"
                  style="width: 65px; height: 65px; object-fit: cover"
                />
              </td>
              <td class="align-middle">
                <c:out value="${product.getTitre()}" />
              </td>
              <td class="align-middle">
                <c:out value="${product.getPrix()}" />
              </td>
              <td class="align-middle">
                <c:out value="${product.getQuantityDispo()}" />
              </td>
              <td class="align-middle">
                <c:out value="${product.getCategorie().getCategorie()}" />
              </td>
              <td class="position-relative">
                <div
                  class="position-absolute top-0 left-0 h-100 w-100 d-flex justify-content-evenly align-items-center"
                >
                  <a
                    href="/dashboard/edit/${product.getId()}"
                    class="text-warning"
                  >
                    <i class="fa-solid fa-pen-to-square"></i>
                  </a>

                  <form
                    method="post"
                    action="/dashboard/products/delete"
                    onsubmit="return confirm('Do you really want to delete this product?');"
                  >
                    <input
                      readonly
                      hidden="hidden"
                      name="delete_id"
                      value="${product.getId()}"
                    />
                    <button class="btn text-danger">
                      <i class="fa-solid fa-trash-can"></i>
                    </button>
                  </form>
                </div>
              </td>
            </tr>
          </c:forEach>
        </tbody>
      </table>
    </div>
  </div>
</section>

<%@include file="/WEB-INF/view/shared/footer.jsp" %>
