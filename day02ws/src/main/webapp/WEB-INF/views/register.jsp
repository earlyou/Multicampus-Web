<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h1>Register page</h1>
	<form action="register" method="post">
		<fieldset>
			<legend>Register</legend>
			<p><label for="iid">ID</label><input id="iid" type="text" name="id"></p>
			<p><label for="ipwd">PWD</label><input id="ipwd" type="password" name="pwd"></p>
			<p><label for="iname">NAME</label><input id="iname" type="text" name="name"></p>
			<p><label for="idate">BIRTH</label><input id="idate" type="date" name="birth"></p>
			<p>GENDER
			<input type="radio" name="gender" value="F">Female
			<input type="radio" name="gender" value="M">Male</p>
		</fieldset>
		<p><input type="submit" value="register"></p>
	</form>
</body>
</html>