<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>P159</title>
<style>
	*{
		margin: 0;
		padding: 0;
	}
	div{
		width: 200px;	/* 0이 안라면 단위를 꼭 써라*/
		height: 200px;
		border: 3px dashed red;
		border-radius: 30px 30px 0 0;
		margin: 20px;
		padding: 10px;
	}
	p{
/*		display: none;
		visibility: hidden;	*/
		display: inline-block;
		width: 100px;
		font-family: 'Koulen', cursive;
	}
	span{
		font-family: 'Oleo Script Swash Caps', cursive;
	}
	
</style>
</head>
<body>
	<h1>P159</h1>
	<div><span>TEXT</span></div>
	
	<h1>P166</h1>
	<span>Span1</span><span>Span2</span>
	<p>Paragraph</p>
	<span>Span3</span><span>Span4</span>
</body>
</html>