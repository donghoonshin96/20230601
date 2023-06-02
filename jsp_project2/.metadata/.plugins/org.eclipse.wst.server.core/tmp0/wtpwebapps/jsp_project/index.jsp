<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Index</title>
</head>
<body>
	<h1>Index Page</h1>
	<c:if test="${ses.id ne null}">
    ${ses.id}님이 로그인 하였습니다. <br>
    ${ses.id}님은 ${ses.age}세 입니다. <br>
    계정생성일: ${ses.reg_date}<br>
    마지막 접속: ${ses.last_login}<br>
		<form action="/mem/modify" method="post">
			<button type="submit">회원정보 수정</button>
		</form>
		<a href="/mem/logout"><button>로그아웃</button></a>
		<c:if test="${ses.id eq 'admin'}">
			<a href="/mem/list"><button>회원 목록</button></a>
		</c:if>
		<br>
		<a href="/brd/page"><button>글게시판</button></a>
		<br>
	</c:if>

	<c:if test="${ses.id eq null}">
		<a href="/mem/login"><button>로그인</button></a>
	</c:if>
	<a href="/mem/join"><button>회원 가입</button></a>
</body>
<script type="text/javascript">
	const msg_login = `<c:out value="${msg_login}" />`;
	console.log(msg_login);
	if (msg_login === '0') {
		alert('로그인 정보가 올바르지 않습니다.');
	}
</script>
</html>
