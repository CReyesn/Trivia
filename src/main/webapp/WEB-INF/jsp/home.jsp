<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css"
	integrity="sha384-zCbKRCUGaJDkqS1kPbPd7TveP5iyJE0EjAuZQTgFLD2ylzuqKfdKlfG/eSrtxUkn"
	crossorigin="anonymous">
<title>Insert title here</title>
</head>
<body>

	<nav class="navbar navbar-expand-lg navbar-dark bg-dark ">
		<div class="collapse navbar-collapse" id="navbarSupportedContent">
			<ul class="navbar-nav mr-auto">
				<li class="nav-item active"><a class="nav-link" href="#">Trivia
				</a></li>
				<li class="nav-item ml-5"><a class="nav-link" href="/logout">Logout</a></li>
			</ul>
		</div>
	</nav>


	<div class="mx-5 my-5">
		<h3>Bienvenido, ${name} elige una de las siguientes categorias:</h3>
	</div>

<!-- Arte,Biologia,Cultura,Deportes,Fisica,Historia,Politica,Quimica,Tecnologia -->

	<div class="row mx-2 my-4">
		<div class="col">
			<h3 class="rounded-pill border border-warning text-center">
				<a class="text-decoration-none text-reset" href="#">Arte</a>
			</h3>
		</div>
		<div class="col">
			<h3 class="rounded-pill border border-warning text-center">
				<a class="text-decoration-none text-reset" href="#">Biologia</a>
			</h3>
		</div>
		<div class="col">
			<h3 class="rounded-pill border border-warning text-center">
				<a class="text-decoration-none text-reset" href="#">Cultura</a>
			</h3>
		</div>
	</div>

	<div class="row mx-2 my-4">
		<div class="col">
			<h3 class="rounded-pill border border-primary text-center">
				<a class="text-decoration-none text-reset" href="http://localhost:8080/categoria/form?categoria=deportes">Deportes</a>
			</h3>
		</div>
		<div class="col">
			<h3 class="rounded-pill border border-primary text-center">
				<a class="text-decoration-none text-reset" href="#">Fisica</a>
			</h3>
		</div>
		<div class="col">
			<h3 class="rounded-pill border border-primary text-center">
				<a class="text-decoration-none text-reset" href="#">Historia</a>
			</h3>
		</div>
	</div>

	<div class="row mx-2 my-4">
		<div class="col">
			<h3 class="rounded-pill border border-danger text-center">
				<a class="text-decoration-none text-reset" href="#">Politica</a>
			</h3>
		</div>
		<div class="col">
			<h3 class="rounded-pill border border-danger text-center">
				<a class="text-decoration-none text-reset" href="#">Quimica</a>
			</h3>
		</div>
		<div class="col">
			<h3 class="rounded-pill border border-danger text-center">
				<a class="text-decoration-none text-reset" href="#">Tecnologia</a>
			</h3>
		</div>
	</div>

</body>
</html>