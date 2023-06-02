<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Modify Page</title>
<script>
	function showConfirmation(message) {
		alert(message);
	}

	function deletePost() {
		let t = confirm("정말로 삭제하시겠습니까?");
		if (t) {
			document.getElementById("deleteForm").submit();
			alert("삭제가 완료되었습니다.");
		}
	}
</script>
</head>
<body>
	<h1>Modify Page</h1>
	<form method="post" action="/brd/update" enctype="multipart/form-data">
		<input type="hidden" name="bno" value="${board.bno}" /> 
		Title <input type="text" name="title" value="${board.title}"> <br>
		Content <textarea name="content" required>${board.content}</textarea><br>
		Image_file <img alt="없음" src="/_fileUpload/th_${board.image_file }">
		<input type="hidden" name="image_file" value="${board.image_file }"> <br>
		<input type="file" name="new_file"><br>
		<input type="submit" value="Modify" onclick="showConfirmation('수정이 완료되었습니다.')">
	</form>
	<form id="deleteForm" method="post" action="/brd/delete">
		<input type="hidden" name="bno" value="${board.bno}" />
		<!--  <input type="hidden" name="delete_image" value="true" />-->
		<button type="button" onclick="deletePost();">Delete</button>
	</form>
</body>
</html>
