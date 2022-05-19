<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>p192</title>
<style>
.box{
	width: 100px;
	height: 100px;
	position: absolute;
	opacity: 0.8;
/*	float: right;	*/
}
.box:nth-child(1){
	background-color: red;
	left: 10px;
	top: 10px;
	z-index: 100;
}
.box:nth-child(2){
	background-color: blue;
	left: 50px;
	top: 50px;
	z-index: 10;
}
.box:nth-child(3){
	background-color: green;
	left: 90px;
	top: 90px;
	z-index: 20;
}
</style>
</head>
<body>	
<!--<h1>p192</h1>	-->
	<div class="box"></div>
	<div class="box"></div>
	<div class="box"></div>
</body>
</html>