<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import = "com.waguwagu.dto.User" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%
	User user = (User) session.getAttribute("logginInUser");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>리뷰 상세 페이지</title>
</head>
<body>
	리뷰 제목 : ${review.reviewTitle}<br>
	작성자 : ${review.reviewWriter}<br>
	상세 내용 : ${review.reviewContent}<br>
	등록일 : ${review.reviewRegDate }<br>
	수정일 : ${review.reviewUpdatedAt }<br>
	<c:if test="${loggedInUser.userId==review.reviewWriter }">
		<a href="review?act=updateform&reviewId=${review.reviewId }&videoId=${review.videoId}">리뷰 수정하기</a>
		<a href="review?act=remove&reviewId=${review.reviewId }&videoId=${review.videoId}">리뷰 삭제하기</a>
	</c:if>
	
	<!-- alert 출력 : 리뷰 수정/삭제 실패 (세션 유지시간 초과) -->
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