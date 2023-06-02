<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Join</title>
</head>
<body>
	<h1>Join Page</h1>
	<form action="/mem/register" method="post">
	    Id : <input type="text" name="id" placeholder="ID"><br>
	    Password : <input type="password" name="password"><br>
	    Email : <input type="email" name="email" placeholder="abc@example.com"><br>
	    Age : <input type="text" name="age">
	    <button type="submit">가입완료</button>
	</form>
</body>
</html>