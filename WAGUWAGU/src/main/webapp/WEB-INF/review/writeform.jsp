<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.waguwagu.dto.User" %>
<%
	//세션에서 유저 정보 가져오기
	User loggedInUser = (User) session.getAttribute("loggedInUser");
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<!-- 리뷰 등록 폼 -->
	<form action="review" method="POST">
		<input type="hidden" name="act" value="write">
		글제목 : <input type="text" name="reviewTitle" required>
		글쓴이 : <input type="text" name="reviewWriter" value="${loggedInUser.userId }" readonly>
		상세내용 : <textarea rows="10" cols="30" name="reviewContent"></textarea>
		<!-- 영상번호 hidden으로 보내기 -->
		<input type="hidden" name="videoId" value="${param.videoId}">
		<button type="submit">리뷰 등록</button>
	</form>
</body>
</html>