<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import = "com.waguwagu.dto.User" %>
    
<%
	//세션에서 유저 정보 가져오기(Object -> User로 형변환)
	User loggedInUser = (User) session.getAttribute("loggedInUser");
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>WAGUWAGU</title>
</head>
<body>
	<!-- 로그인 유무에 따라 다른 환영 메시지 -->
	<% if(loggedInUser != null){ %>
		<h2>환영합니다, <%= loggedInUser.getName() %>님!</h2>
		<a href="user?act=logout">로그아웃</a>
		<a href="user?act=deleteId">회원탈퇴</a>
	<% } else { %>
		<h2>로그인이 필요합니다.</h2>
		<a href="user?act=loginform">로그인</a>
	<% } %>
	
	<!-- alert 출력 : 회원탈퇴 완료 -->
	<%
		String errorMessage = (String) session.getAttribute("errorMessage");
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