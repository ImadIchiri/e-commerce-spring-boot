<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<!-- Bootstrap -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9" crossorigin="anonymous">
<!-- FontAwsome -->
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.2/css/all.min.css" integrity="sha512-z3gLpd7yknf1YoNbCzqRKc4qyor8gaKU1qmn+CShxbuBusANI9QpRohGBreCFkKxLhei6S9CQXFEbbKuqLg0DA==" crossorigin="anonymous" referrerpolicy="no-referrer" />
<style>
	.left_nav {
		position: absolute;
	    height: calc(100vh - 58px);
	    width: 100%;
	    max-width: 250px;
	    top: 58px;
	    left: 0;
	    transform: translateX(-100%);
	    transition: 0.35s ease-in-out;
	    background: linear-gradient(to bottom, #800080, #4b0082);
	}
	.left_nav.visible {
	    transform: translateX(0%);
	}
	.toggle_laft_nav {
		all: unset;
		position: absolute;
		top: 0.5rem;
		right: 0;
		transform: translateX(calc(100% + 5px));
	    display: block;
	    background-color: #fff;
	    border-radius: 0.5rem;
	    height: 32px;
	    width: 32px;
	    display: grid;
	    place-content: center;
	    color: #fff;
	    background: linear-gradient(to bottom, #800080, #4b0082);
	}
	.left_nav > ul > li {
		background-color: transparent;
		border: 0;
	}
	.left_nav > ul > li > a {
		color: #fff;
    	font-size: 1.25rem;
		text-decoration: none;
	}
	.toggle_laft_nav_close {
		all: unset;
	    position: relative;
	    display: block;
	    margin: 0.5rem 0.5rem 0 auto;
	    color: #800080;
	    background-color: #fff;
	    border-radius: 0.5rem;
	    height: 32px;
	    width: 32px;
	    display: grid;
	    place-content: center;
	 }
</style>
</head>
<body>
<nav class="navbar navbar-expand-lg navbar-light bg-light position-sticky top-0" style="background: linear-gradient(to top, #800080, #4b0082);">
  <div class="container position-relative">
    <a class="navbar-brand h1" href="/dashboard">HR</a>
    
    <button type="button" class="btn p-0" data-bs-target="#navbarSupportedContent" data-bs-toggle="collapse" aria-controls="navbarSupportedContent" aria-expanded="false">
      <img src="https://file.xunruicms.com/admin_html/assets/pages/media/profile/profile_user.jpg" class="rounded-circle float-start" 
      	   alt="..." 
	       style="width: 35px; height: 35px; cursor: pointer;">
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

<!-- Lef Nav -->
<article class="left_nav" id="left_nav">
	<button class="toggle_laft_nav" id="toggle_laft_nav" onclick="toggleLeftNav()">
		<i class="fa-solid fa-bars"></i>
	</button>
	<button class="toggle_laft_nav_close" id="toggle_laft_nav_close" onclick="toggleLeftNav()">
		<i class="fa-solid fa-xmark fa-lg"></i>
	</button>
	<ul class="list-group list-group-flush">
		<li class="list-group-item"><a href="/dashboard/products">Products</a></li>
		<li class="list-group-item"><a href="/dashboard/categories">Categories</a></li>
		<li class="list-group-item"><a href="/dashboard/orders">Orders</a></li>
	</ul>
</article>