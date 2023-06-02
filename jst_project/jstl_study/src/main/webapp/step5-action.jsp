<%@ page language="java" contentType="text/html; charset=UTF-8" 
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSTL Action</title>
</head>
<body>
    이름 : ${param.name }<br>
    나이 : ${param.age }<br>
    <c:choose>
        <c:when test="${param.age>=20}">
            성인입니다.<br>
        </c:when>
        <c:when test="${param.age>=15 }">
            청소년입니다.<br>
        </c:when>
        <c:when test="${param.age>=5 && param.age<15 }">
            어린이입니다.<br>
        </c:when>
        <c:when test="${param.age>=1 && param.age<5 }">
            유아입니다.<br>
        </c:when>
        <c:when test="${param.age<=0 }">
            아직태어나지않았습니다. <br>
        </c:when>   
    </c:choose>
    
    <a href="step6-foreach.jsp">step6-forEach로 이동</a>
    
</body>
</html>
