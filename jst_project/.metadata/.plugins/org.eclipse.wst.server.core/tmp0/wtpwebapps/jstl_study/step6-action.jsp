<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
    //post 방식의 한글처리 (인코딩 설정)
    request.setCharacterEncoding("utf-8");
%>     
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
    <h2>주문 정보</h2>
    주문자 : ${param.name }<br><br>
	선택한 메뉴 : <br>
	<c:forEach items="${paramValues.menu}" var="menu" varStatus="i">
		${i.count }. ${menu }<br>
	</c:forEach>
	주문하신 메뉴가 나왔습니다.
	
	
</body>
</html>