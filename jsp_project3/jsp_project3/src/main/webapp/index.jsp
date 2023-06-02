<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>메인화면</title>
</head>
<style>
h1 {
	text-align: center;
}

ul {
	text-align: right;
}

a {
	text-decoration-line: none;
	margin-right: 0px;
}

a:visited {
	color: black;
}


</style>
<body>
	<ul>
		<a href="/mem/join">회원 가입</a>
		<c:if test="${ses.id eq null}">
			<a href="/mem/login">로그인</a>
		</c:if>
	</ul>
	<hr>
	<h1><a href="/">메인</a></h1>
	<br>
	<div>
	<c:if test="${ses.id ne null}">
    ${ses.id}님이 로그인 하였습니다. <br>
    계정 생성일: ${ses.reg_date}<br>
    최근 방문일: ${ses.last_login}<br>
		<form action="/mem/modify" method="post">
			<button type="submit">회원정보 수정</button>
		</form>
		<a href="/mem/logout"><button>로그아웃</button></a>
		<c:if test="${ses.id eq 'admin'}">
			<a href="/mem/list"><button>회원 목록</button></a>
		</c:if>
		</div>
	<a href="/brd/page"><button>게시판</button></a>
	<br>

		<br>
	</c:if>
</body>
<script type="text/javascript">
	const msg_login = `<c:out value="${msg_login}" />`;
	console.log(msg_login);
	if (msg_login === '0') {
		alert('로그인 정보가 올바르지 않습니다.');
	}
</script>
</html>