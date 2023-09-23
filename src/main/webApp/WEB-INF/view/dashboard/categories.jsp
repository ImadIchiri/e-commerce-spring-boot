<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %> <%@include
file="/WEB-INF/view/shared/headerAndLefNav.jsp" %>

<section class="container py-5">
  <div class="row">
    <div class="table-responsive col-12 col-md-8 mx-auto">
      <table class="table table-bordered table-striped text-center">
        <thead>
          <tr>
            <th scope="col">#</th>
            <th scope="col">Name</th>
            <th scope="col">Products</th>
          </tr>
        </thead>
        <tbody>
          <c:forEach var="category" items="${categories}">
            <tr>
              <td class="align-middle" style="width: 33.33%">
                <c:out value="${category.getId()}" />
              </td>
              <td class="align-middle" style="width: 33.33%">
                <c:out value="${category.getCategorie()}" />
              </td>
              <td class="align-middle" style="width: 33.33%">
                <a
                  href="/dashboard/products/${category.getCategorie()}"
                  class="btn btn-info btn-sm"
                  >All Products</a
                >
              </td>
            </tr>
          </c:forEach>
        </tbody>
      </table>
    </div>
  </div>
</section>

<%@include file="/WEB-INF/view/shared/footer.jsp" %>
