<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h1>Login Page</h1>
	<form action="login" method="post">
		<fieldset>
			<legend>Login</legend>
			<p><label for="iid">ID</label><input id="iid" type="text" name="id"></p>
			<p><label for="ipwd">PWD</label><input id="ipwd" type="password" name="pwd"></p>
		</fieldset>
		<p><input type="submit" value="login"></p>
	</form>
</body>
</html>