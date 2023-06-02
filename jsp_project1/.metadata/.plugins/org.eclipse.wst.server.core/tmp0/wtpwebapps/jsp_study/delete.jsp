<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상품삭제 페이지</title>
</head>
<body>
	<h1>Product Delete Page</h1>
		<form action="/edit.pd" method="post">
			<input type="hidden" name="pno" value="${pvo.pno}"> 
			Name :<input type="text" name="pname" value="${pvo.pname }"><br> 
			Price : <input type="text" name="price" value="${pvo.price }"><br> 
			Regdate : <input type="text" name="regdate" value="${pvo.regdate }" disabled><br> 
			Madeby : <input type="text" name="madeby" value="${pvo.madeby }"><br>
			<button type="submit">delete</button>
		</form>
</body>
</html>