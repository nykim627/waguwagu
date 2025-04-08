<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.waguwagu.dto.User" %>
<%
	//세션에서 유저 정보 가져오기
	User user = (User) session.getAttribute("loggedInUser");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>리뷰 수정</title>
<%@ include file="/WEB-INF/template/headcss.jsp"%>
</head>
<body class="bg-dark text-white">
    <div class="tm-page-wrap mx-auto">
        <div class="position-relative">
            <%@ include file="/WEB-INF/template/header.jsp" %>
            <%@ include file="/WEB-INF/template/headercarousel.jsp" %>
        </div>

        <!-- 리뷰 수정 폼 -->
        <div class="container mt-5">
            <h2 class="mb-4">리뷰 수정</h2>
            <form action="review" method="POST" class="bg-light text-dark p-4 rounded shadow">
                <input type="hidden" name="act" value="update">
                <input type="hidden" name="videoId" value="${review.videoId}">
                <input type="hidden" name="reviewId" value="${review.reviewId}">

                <div class="mb-3">
                    <label class="form-label">글 제목</label>
                    <input type="text" name="reviewTitle" class="form-control" value="${review.reviewTitle}" readonly>
                </div>

                <div class="mb-3">
                    <label class="form-label">글쓴이</label>
                    <input type="text" name="reviewWriter" class="form-control" value="${loggedInUser.userId}" readonly>
                </div>

                <div class="mb-3">
                    <label class="form-label">상세 내용</label>
                    <textarea name="reviewContent" rows="8" class="form-control">${review.reviewContent}</textarea>
                </div>

                <button type="submit" class="btn btn-dark">리뷰 수정</button>
            </form>
        </div>
    </div>
    
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>
    
</body>

</html>