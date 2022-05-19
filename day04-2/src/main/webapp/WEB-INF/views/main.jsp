<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<link rel="stylesheet" href="css/main.css">
<style>
	
</style>
</head>
<body>
	<header>
		<h1><a href="/">HTML5 & CSS3.0</a></h1>
	</header>
	<nav>
		<ul>
			<li><a href="html5">HTML5</a></li>
			<li><a href="css3">CSS3</a></li>
			<li><a href="js">JavaScript</a></li>
			<li><a href="media">Media</a></li>
		</ul>
	</nav>
	<section>
		<jsp:include page="${center}.jsp"></jsp:include>
	</section>
	<footer></footer>
</body>
</html>