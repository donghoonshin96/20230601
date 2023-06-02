<%@ page import="model.CarVO"%>
<%@ page import="java.util.ArrayList"%>
<%@ page import="java.util.HashMap"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>EL연습</title>
</head>
<body>
	<h3>EL(Expression Language)</h3>
	<%
	CarVO car = new CarVO("1234", "벤츠", 5000);
	// request.setAttribute : request객체에 값을 저장하는 역할
	// request.getAttribute : request객체에 값을 가져오는 역할
	// request.setAttribute("변수명",값);
	request.setAttribute("cvo", car);
	%>

	<!-- 변수 출력 -->
	<strong>1. CarVO의 객체에서 변수 출력</strong>
	<br>
	<!-- 방법 1 : requestScope를 사용 -->
	${requestScope.cvo.name}
	<br>

	<!-- 방법 2 : requestScope (생략가능) -->
	${cvo.name }, ${cvo.num }, ${cvo.price }
	<br>

	<hr>

	<!-- 리스트로 변수 출력 -->
	<%
	ArrayList<CarVO> list = new ArrayList<CarVO>();
	list.add(new CarVO("4567", "테슬라", 4000));
	session.setAttribute("carList", list);
	%>
	<strong>1. CarVO의 객체를 session 영역으로 설정 list로 출력</strong>
	<br> ${sessionScope.carList[0].name }
	<br>
	<hr>

	<!-- 해쉬맵으로 변수를 출력 key: car1, value: instance -->
	<%
	HashMap<String, CarVO> map = new HashMap<>();
	map.put("car1", new CarVO("1111", "제네시스", 5000));
	map.put("car2", new CarVO("5678", "BMW", 6000));
	request.setAttribute("carMap", map);
	%>

	<strong>3. HashMap에서 변수 출력</strong>
	<br> ${requestScope.carMap.car1.name}
	<br> ${carMap.car2.name}
	
	<hr>
	<a href = "step2-1.jsp">step2-1로 이동</a>


</body>
</html>