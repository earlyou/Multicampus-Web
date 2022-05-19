<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>P135</title>
<style>
	input[name="pwd"]{
		background: pink;
	}
	input[type="submit"]:hover{
		color: white;
		background: black;
	}
	input:focus{
		background: blue;
	}
</style>
</head>
<body>
	<h1>P135</h1>
	<form action="" method="post">
		ID<input type="text" name="id"><span>Mandatory</span><br>
		PWD<input type="password" name="pwd"><span>Mandatory</span><br>
		<input type="submit" name="login"><br>
	</form>
</body>
</html> 