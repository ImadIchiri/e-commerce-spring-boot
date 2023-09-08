<%@include file="/WEB-INF/view/shared/headerAndLefNav.jsp" %>

<section class="container py-5">
<div class="row">
	<div class="table-responsive col-10 mx-auto">
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
		  
		    <tr>
		      <td>
		      	<img src="https://istyle.ma/media/catalog/product/cache/image/700x700/e9c3970ab036de70892d86c6d221abfe/i/p/iphone_14_pro_max_deep_purple_pdp_image_position-1a_en_4.jpg"
		      	 style="width: 65px; height: 65px; object-fit: cover;" />
		      </td>
		      <td class="align-middle">1</td>
		      <td class="align-middle">2</td>
		      <td class="align-middle">3</td>
		      <td class="align-middle">4</td>
		      <td class="position-relative">
		      	<div class="position-absolute top-0 left-0 h-100 w-100 d-flex justify-content-evenly align-items-center">
		      		<a href="/dashboard/edit/${id}" class="text-warning">
		      			<i class="fa-solid fa-pen-to-square"></i>
		      		</a>
		      	
		      		<form method="post" action="/dashboard/delete" onsubmit="return confirm('Do you really want to delete this product?');">
		      			<input readonly hidden="hidden" name="delete_id" value="${id}" />
		      			<button class="btn text-danger"><i class="fa-solid fa-trash-can"></i></button>
		      		</form>
	      		</div>
	      	</td>
		   </tr>

		  </tbody>
		</table>
		</div>
</div>
</section>

<%@include file="/WEB-INF/view/shared/footer.jsp" %>