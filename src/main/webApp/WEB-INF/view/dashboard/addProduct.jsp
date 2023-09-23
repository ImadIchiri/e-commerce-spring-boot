<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> <%@include
file="/WEB-INF/view/shared/headerAndLefNav.jsp" %> <%@ taglib prefix="form"
uri="http://www.springframework.org/tags/form"%>

<div class="container" style="min-height: 100vh">
  <div class="row">
    <div class="col-10 col-md-8 mx-auto">
      <form:form
        action="/dashboard/products/add"
        method="post"
        modelAttribute="product"
        enctype="multipart/form-data"
      >
        <input name="id" hidden="" value="" />

        <div class="mb-3">
          <form:label for="titre" class="form-label">Titre</form:label>
          <input
            type="text"
            class="form-control"
            id="titre"
            path="titre"
            required="required"
            placeholder="Titre du produit.."
            value=""
          />
        </div>

        <div class="mb-3">
          <form:label for="prix" class="form-label">Prix</form:label>
          <input
            type="text"
            class="form-control"
            id="prix"
            path="prix"
            required="required"
            placeholder="Prix du produit.."
            value=""
          />
        </div>

        <div class="mb-3">
          <form:label for="prix" class="form-label">Quantite</form:label>
          <input
            type="text"
            class="form-control"
            id="quantite"
            path="quantite"
            required="required"
            placeholder="Quantite du produit.."
            value=""
          />
        </div>

        <div class="mb-3">
          <form:label for="prix" class="form-label">Image</form:label>
          <input
            type="file"
            class="form-control"
            id="image"
            path="image"
            required="required"
            accept="image/*"
          />
        </div>

        <input type="text" id="image" name="image" hidden="hidden" />

        <div class="mb-3">
          <form:label for="categorie" class="form-label">Categorie</form:label>
          <select class="form-select" path="categorie" required="required">
            <option value="" selected="selected" disabled="disabled">
              Categorie
            </option>
            <c:forEach var="category" items="${categories}">
              <option value="${category.getCategorie()}">
                <c:out value="${category.getCategorie()}" />
              </option>
            </c:forEach>
          </select>
        </div>

        <button type="submit" class="btn btn-primary">Ajouter</button>

        <button type="submit" class="btn btn-primary">Modifier</button>
      </form:form>
    </div>
  </div>
</div>

<%@include file="/WEB-INF/view/shared/footer.jsp" %>
