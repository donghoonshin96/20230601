<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta charset="UTF-8">
<title>회원 목록</title>
</head>
<body>
	<h1>회원 목록</h1>
	<table border="1">
		<thead>
			<tr>
				<th>ID</th>
				<th>Email</th>
				<th>Age</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="member" items="${memberList}">
				<tr>
					<td>${member.id}</td>
					<td>${member.email}</td>
					<td>${member.age}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<br>
	<a href="${pageContext.request.contextPath}/index.jsp">돌아가기</a>
</body>
</html>
