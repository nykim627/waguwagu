<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입</title>
</head>
<body>

	<!-- 회원가입 폼 -->
	<form action="user" method="post">
		<input type="text" name="userId" placeholder="아이디" required>
		<input type="password" name="userPassword" placeholder="비밀번호" required>
		<input type="email" name="userEmail" placeholder="이메일 주소" required>
		<button type="submit">회원가입</button>
	</form>

	<!-- 회원가입 실패 시 alert 출력 -->
	<%
		String errorMessage = (String) request.getAttribute("errorMessage");
		if(errorMessage != null){
	%>
		<script type="text/javascript">
			alert("<%= errorMessage %>")
		</script>
	
	<%
		}
	%>

</body>
</html>