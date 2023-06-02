<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입 페이지</title>
<script>
	function validateForm() {
		// Get form input values
		var name = document.forms["registrationForm"]["name"].value;
		var age = document.forms["registrationForm"]["age"].value;
		var id = document.forms["registrationForm"]["id"].value;
		var password = document.forms["registrationForm"]["password"].value;
		var email = document.forms["registrationForm"]["email"].value;

		// Check if any field is empty or contains invalid data
		if (name === "" || age === "" || id === "" || password === "" || email === "") {
			alert("입력한 정보를 다시 확인해주세요.");
			return false; // Prevent form submission
		}

		// All fields are filled, show success message
		alert("축하합니다. 회원가입이 완료되었습니다.");
		return true; // Allow form submission
	}
</script>
</head>
<body>
	<h1>회원가입 페이지</h1>
	<form name="registrationForm" action="/mem/register" method="post" onsubmit="return validateForm()">
		이름 : <input type="text" name="name" placeholder="이름"><br>
		나이 : <input type="text" name="age"><br>
		아이디 : <input type="text" name="id" placeholder="아이디"><br>
		비밀번호 : <input type="password" name="password"><br>
		이메일 : <input type="email" name="email" placeholder="abc@naver.com"><br>
		<button type="submit">가입완료</button>
	</form>
		<a href="/"><button type="submit">홈으로</button></a>
</body>
</html>
