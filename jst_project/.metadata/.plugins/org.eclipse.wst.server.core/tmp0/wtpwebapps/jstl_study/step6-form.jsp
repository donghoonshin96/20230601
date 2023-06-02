<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>     
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!--  get방식 : 쿼리스트링을 달고 URL 상에서 이동하는 방식 (기본) -->
<!-- post방식 : 데이터를 숨겨서 가는 방식 보안상 내용이 많을 경우 -->
    <form action="step6-action.jsp" method="post">
        <label for="name">주문자 : </label>
		<input type="text" name="name" id="name" /><br><br>
		<label>선택한 메뉴 : </label><br>
		<input type="checkbox" name="menu" value="햄버거"> 햄버거<br>
		<input type="checkbox" name="menu" value="프렌치프라이"> 프렌치프라이<br>
		<input type="checkbox" name="menu" value="코울슬로"> 코울슬로<br>
		<input type="checkbox" name="menu" value="콜라"> 콜라<br><br>
		<input type="submit" value="주문하기" />
    </form>
</body>
</html>