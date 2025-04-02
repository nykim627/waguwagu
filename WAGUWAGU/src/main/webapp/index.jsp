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
	<% if(loggedInUser != null){ %>
		<h2>환영합니다, <%= loggedInUser.getName() %>님!</h2>
		<a href="user?act=logout">로그아웃</a>
	<% } else { %>
		<h2>로그인이 필요합니다.</h2>
		<a href="user?act=loginform">로그인</a>
	<% } %>
</body>
</html>