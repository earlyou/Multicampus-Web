<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>P105</title>
<style>
	*{
		margin: 0;
		padding: 0;
	}
	h1{
		color: red;
		background: black;
	}
	#hh1{
		color: blue;
		background: yellow;
	}
	.c1{
		color: green;
		background: pink;
	}
	a,p{
		color: blue
	}
	a:hover{
		color: white;
		background: black;
	}
</style>
</head>
<body>
	<h1>P105</h1>
	<h1 id="hh1">Header1</h1>
	<h1 class="c1">Header1</h1>
	<h2>Header2</h2>
	<h2 class="c1">Header2</h2>
	<a href="#">Click</a>
	<a href="#">Click</a>
	<span class="c1">Span1</span>
	<span>Span2</span>
	<p>Paragraph</p>
</body>
</html>