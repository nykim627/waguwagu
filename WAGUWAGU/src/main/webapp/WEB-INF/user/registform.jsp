<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입</title>
</head>
<body>

	<!-- 아이디 중복 확인을 위한 별도 폼 -->
	<form action="user" method="post">
	<input type="hidden" name="act" value="checkId">
		<p>
		<input type="text" name="userId" placeholder="아이디" required> 
		<button type="submit">아이디 중복 확인</button>
		</p>
	</form>

	<!-- 회원가입 폼 -->
	<form action="user" method="post">
	<input type="hidden" name="act" value="regist">
		<p>
		<input type="text" name="userId" placeholder="아이디" required> 
		</p>
		<input type="password" name="userPassword" placeholder="비밀번호" required>
		<input type="email" name="userEmail" placeholder="이메일 주소" required>
		<input type="text" name="userName" placeholder="성명" required>
		<p>성별 : 
		<input type="radio" name="userGender" value="남성" id="male">
		<label for="male">남</label>
		<input type="radio" name="userGender" value="여성" id="female">
		<label for="female">여</label>
		<input type="radio" name="userGender" value="알 수 없음" id="idk">
		<label for="idk">알 수 없음</label>
		</p>
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