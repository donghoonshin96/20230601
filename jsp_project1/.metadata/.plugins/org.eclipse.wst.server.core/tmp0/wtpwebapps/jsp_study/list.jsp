<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상품리스트 보기</title>
</head>
<body>
	<h1>Product List Page</h1>
	<br>
	<table border="1">
		<thead>
			<tr>
				<th>pno</th>
				<th>pname</th>
				<th>regDate</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${list }" var="pvo">
				<tr>
					<td>${pvo.pno }</td>
					<td><a href="detail.pd?pno=${pvo.pno }">${pvo.pname }</a></td>
					<td>${pvo.regdate }</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<a href="register.pd"><button type="button">register</button></a>
	<a href="index.jsp"><button type="button">index</button></a>
</body>
</html>