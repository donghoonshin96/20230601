<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Board List</title>
</head>
<body>
	<h1>Board List</h1>
	<!-- 검색 라인 -->
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
			<button type="submit">검색</button>
		</div>
	</form>




	<table border="1">
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
		<a href="/brd/modify?bno=${board.bno}">수정</a>
		<a href="/brd/delete?bno=${board.bno}">삭제</a>
	</c:if>
	<a href="/brd/register"><button>글쓰기</button></a>
	<a href="/"><button>메인</button></a>
	<br>
	<!-- 페이지네이션 위치 -->
	<!-- 컨트롤러에서 page 정보를 싣고 와야함. -->
	<!-- 1~endpage까지 숫자 반복 foreach -->

	<!-- 이전페이지 -->
	<c:if test="${pgh.prev }">
		<a
			href="/brd/page?pageNo=${pgh.startPage-1}&qty=${pgh.pgvo.qty }&type=${pgh.pgvo.type}&keyword=${pgh.pgvo.keyword}">◁</a>
	</c:if>
	<c:forEach begin="${pgh.startPage }" end="${pgh.endPage }" var="i">
		<a
			href="/brd/page?pageNo=${i}&qty=${pgh.pgvo.qty }&type=${pgh.pgvo.type}&keyword=${pgh.pgvo.keyword}">${i }
			|</a>
	</c:forEach>
	<!-- 다음페이지 -->
	<c:if test="${pgh.next }">
		<a
			href="/brd/page?pageNo=${pgh.endPage+1}&qty=${pgh.pgvo.qty }&type=${pgh.pgvo.type}&keyword=${pgh.pgvo.keyword}">▷</a>
	</c:if>


</body>
</html>
