<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>리뷰 목록</title>
</head>
<body>
	<!-- 특정 영상에 대한 모든 리뷰 목록 테이블 -->
	<h2> 리뷰 목록 </h2>
	<table>
		<tr>
			<th>제목</th>
			<th>글쓴이</th>
			<th>조회</th>
			<th>업데이트일</th>
		</tr>
		<c:forEach items="${videoIdList }" var="review">
			<tr>
				<td><a href="review?act=detail&reviewId=${review.reviewId}">${review.reviewTitle}</a></td>
				<td>${review.reviewWriter}</td>
				<td>${review.reviewViewCnt}</td>
				<td>${review.reviewUpdatedAt}</td>
			</tr>
		</c:forEach>
	</table>
	<a href="review?act=writeform&videoId=${param.videoId }">리뷰 작성하기</a>
	
	<!-- alert 출력 : 회원만 작성가능 -->
	<%
		String errorMessage = (String) request.getAttribute("errorMessage");
		if(errorMessage!=null){
	%>
		<script type = "text/javascript">
			alert("<%= errorMessage %>");
		</script>
	<%
		}
	%>
</body>
</html>