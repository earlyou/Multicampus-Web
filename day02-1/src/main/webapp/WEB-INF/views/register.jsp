<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h1>Register Page</h1>
	<form action="" method="post">
		<fieldset>
			<legend>Register</legend>
			<p><label for="iid">ID</label><input id="iid" type="text" name="id"></p>
			<p><label for="ipwd">PWD</label><input id="ipwd" type="password" name="pwd"></p>
			<p><label for="idate">BIRTH</label><input id="idate" type="date" name="birth"></p>
			<p>GENDER
			<input type="radio" name="gender" value="F">Female
			<input type="radio" name="gender" value="M">Male
			</p>
			<p>Resume</p>
			<p><textarea name="resume" rows="10" cols="100"></textarea>
			</p>
		</fieldset>
		<p><input type="submit" value="REGISTER"></p>
	</form>
</body>
</html>