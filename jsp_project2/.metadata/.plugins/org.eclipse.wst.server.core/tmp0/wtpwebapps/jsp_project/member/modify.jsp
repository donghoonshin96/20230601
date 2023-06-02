<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Modify Page</title>
</head>
<body>
	<h1>Modify Page</h1>
	<form method="post" action="/mem/modify2">
		<input type="hidden" name="id" value="${ses.id}"/>
		<table>
			<tr>
				<td>ID</td>
				<td><c:out value="${ses.id}" /></td>
			</tr>
			<tr>
				<td>Password</td>
				<td><input type="password" name="password" required></td>
			</tr>
			<tr>
				<td>Email</td>
				<td><input type="email" name="email" value="${ses.email}"
					required></td>
			</tr>
			<tr>
				<td>Age</td>
				<td><input type="number" name="age" value="${ses.age}" required></td>
			</tr>
		</table>
		<input type="submit" value="Modify">
	</form>
	<form method="post" action="/mem/delete">
		<input type="hidden" name="id" value="${ses.id}"> <input
			type="submit" value="Delete">
	</form>

</body>
</html>
