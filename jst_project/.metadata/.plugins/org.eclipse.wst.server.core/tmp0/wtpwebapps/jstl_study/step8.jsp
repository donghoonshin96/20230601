<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page import="java.util.ArrayList"%>
<%@ page import="model.PersonVO"%>

    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>

<body>

<%
    //PersonVO 객체를 이용하여 list에 여러명을 추가 (5명)
    //list를 request 객체에 담아 jsp로 전송
    ArrayList<PersonVO> list = new ArrayList<PersonVO>();
    list.add(new PersonVO("홍길동", 20));
    list.add(new PersonVO("김철수", 30));
    list.add(new PersonVO("박영희", 25));
    list.add(new PersonVO("이영자", 10));
    list.add(new PersonVO("최철호", 15));
    request.setAttribute("list", list);
%>

<!-- 테이블을 생성하여 list에 담긴 PersonVO 객체 정보를 출력 -->
<table border=1>
  <thead>
    <tr>
      <th scope="col">번호</th>
      <th scope="col">이름</th>
      <th scope="col">나이</th>
      <th scope="col">연령대</th>
    </tr>
  </thead>
  <tbody>
    <c:forEach var="person" items="${list}" varStatus="status">
  <tr>
    <th scope="row">${status.count}</th>
    <td>${person.name}</td>
    <td>${person.age}</td>
    <td>
      <c:choose>
        <c:when test="${person.age >= 20}">
          성인
        </c:when>
        <c:otherwise>
          미성년
        </c:otherwise>
      </c:choose>
    </td>
  </tr>
</c:forEach>

  </tbody>
</table>
</body>
</html>
