<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인</title>
</head>
<body>

	<!-- 로그인 폼 -->
	<form action="user" method="post">
	<input type="hidden" name="act" value="login">
		<input type="text" name="userId" placeholder="아이디" required>
		<input type="password" name="userPassword" placeholder="비밀번호" required>
		<button type="submit">로그인</button>
	</form>
	<a href="user?act=registform">회원가입</a>
	
	<!-- 로그인 실패 시 alert 출력 -->
	<%
		String errorMessage = (String) request.getAttribute("errorMessage");
		if(errorMessage!=null){
	%>
		<script type="text/javascript">
			alert("<%= errorMessage %>");
		</script>
	<%
		}
	%>

</body>
</html>