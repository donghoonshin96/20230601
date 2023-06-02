<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page import="controller.BoardController" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
<style>
body {
	font-family: 'Arial', sans-serif;
	margin: 0;
	padding: 0;
}

.container {
	max-width: 800px;
	margin: 0 auto;
	padding: 20px;
}

h1 {
	text-align: center;
	margin-top: 50px;
}

table {
	width: 100%;
	border-collapse: collapse;
}

table th, table td {
	padding: 10px;
	border: 1px solid #ccc;
}

table th {
	background-color: #f2f2f2;
	text-align: center;
}

table td {
	text-align: left;
}

a {
	text-decoration: none;
	color: #007bff;
}

a:hover {
	color: #0056b3;
}

button {
	border-radius: 5px;
	border: none;
	background-color: #007bff;
	color: #fff;
	font-size: 14px;
	font-weight: bold;
	padding: 10px 20px;
	margin-top: 10px;
	cursor: pointer;
}

button:hover {
	background-color: #0056b3;
}

.modify-delete {
	display: flex;
	justify-content: flex-end;
}

.modify-delete a {
	margin-left: 10px;
}
</style>
<title>Board List</title>
</head>
<body>
	<div class="container">
		<h1>Board List</h1>
		<form action="/brd/page" method="post">
			<div>
				<c:set value="${pgh.pgvo.type }" var="typed"></c:set>
				<select name="type">
					<!-- selected : 현재 내가 선택한 값 -->
					<option ${typed == null?'selected':''}>choose...</option>
					<option value="t" ${typed eq 't' ? 'selected':'' }>제목</option>
					<option value="c" ${typed eq 'c' ? 'selected':'' }>내용</option>
					<option value="w" ${typed eq 'w' ? 'selected':'' }>작성자</option>
					<option value="tc" ${typed eq 'tc' ? 'selected':'' }>제목 +
						내용</option>
					<option value="tw" ${typed eq 'tw' ? 'selected':'' }>제목 +
						작성자</option>
					<option value="cw" ${typed eq 'cw' ? 'selected':'' }>내용 +
						작성자</option>
				</select> <input type="text" name="keyword"> <input type="hidden"
					name="pageNo" value="${pgh.pgvo.pageNo }"> <input
					type="hidden" name="qty" value="${pgh.pgvo.qty }">
				<button type="button" class="btn btn-primary position-relative">
					검색 <span 
						class="position-absolute top-0 start-100 translate-middle badge rounded-pill bg-danger">
						${pgh.totalCount}<span class="visually-hidden"></span>
					</span>
				</button>
			</div>
		</form>
		<table>
			<tr>
				<th>글번호</th>
				<th>제목</th>
				<th>작성자</th>
				<th>작성시간</th>
				<th>조회수</th>
			</tr>
			<c:forEach var="board" items="${boardList}">
				<tr>
					<td>${board.bno}</td>
					<td>
						<c:if test="${board.image_file ne '' && board.image_file ne null }">
							<img alt="없음" src="/_fileUpload/th_${board.image_file }">
						</c:if>
				    	<a href="/brd/detail?bno=${board.bno}">${board.title}</a>
				    </td>
					<td>${board.writer}</td>
					<td>${board.reg_date}</td>
					<td>${board.read_count}</td>
				</tr>
			</c:forEach>
		</table>
		<c:if test="${board.writer eq ses.id}">
			<div class="modify-delete">
				<a href="/brd/modify?bno=${board.bno}">수정</a> 
				<a href="/brd/delete?bno=${board.bno}">삭제</a>
			</div>
		</c:if>
		<a href="/brd/register"><button>글쓰기</button></a> <a href="/brd/index"><button>메인</button></a>
		<br>
		<c:if test="${pgh.prev }">
			<a
				href="/brd/page?pageNo=${pgh.startPage-1}&qty=${pgh.pgvo.qty }&type=${pgh.pgvo.type}&keyword=${pgh.pgvo.keyword}">◁</a>
		</c:if>
		<c:forEach begin="${pgh.startPage }" end="${pgh.endPage }" var="i">
			<a
				href="/brd/page?pageNo=${i}&qty=${pgh.pgvo.qty }&type=${pgh.pgvo.type}&keyword=${pgh.pgvo.keyword}">${i }
				|</a>
		</c:forEach>
		<c:if test="${pgh.next }">
			<a
				href="/brd/page?pageNo=${pgh.endPage+1}&qty=${pgh.pgvo.qty }&type=${pgh.pgvo.type}&keyword=${pgh.pgvo.keyword}">▷</a>
		</c:if>
	</div>

	<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.5.4/dist/umd/popper.min.js"></script>
	<script
		src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>
