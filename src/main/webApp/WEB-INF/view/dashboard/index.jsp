<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<!-- Bootstrap -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9" crossorigin="anonymous">

<style>
	.left_nav {
		
	}
</style>
</head>
<body>
<nav class="navbar navbar-expand-lg navbar-light bg-light position-sticky top-0">
  <div class="container position-relative">
    <a class="navbar-brand h1" href="#">HR</a>
    
    <button type="button" class="btn p-0" data-bs-target="#navbarSupportedContent" data-bs-toggle="collapse" aria-controls="navbarSupportedContent" aria-expanded="false">
      <img src="https://file.xunruicms.com/admin_html/assets/pages/media/profile/profile_user.jpg" class="rounded-circle float-start" 
      	   alt="..." 
	       style="width: 45px; height:45px; cursor: pointer;">
    </button>
    
    <div class="position-absolute top-100 end-0 translate-end mt-3 me-3 collapse" id="navbarSupportedContent">
    	<ul class="navbar-nav me-auto mb-2 mb-lg-0">
    		<li>
    			<a class="btn btn-light btn-outline-secondary" href="#">Logout</a>
    		</li>
    	</ul>
    </div>
  </div>
</nav>

<article class="left_nav" id="left_nav">
	<ul class="list-group list-group-flush">
		<li class="list-group-item"><a href="#">Products</a></li>
		<li class="list-group-item"><a href="#">Categories</a></li>
		<li class="list-group-item"><a href="#">Orders</a></li>
	</ul>
</article>

<!-- Bootstrap -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-HwwvtgBNo3bZJJLYd8oVXjrBZt8cqVSpeBNS5n7C8IVInixGAoxmnlMuBnhbgrkm" crossorigin="anonymous"></script>
</body>
</html>