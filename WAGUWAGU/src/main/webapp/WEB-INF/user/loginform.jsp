<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
    String referer = request.getHeader("Referer");
    if (referer != null) {
        session.setAttribute("prevPage", referer);
    }
%>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <title>로그인</title>
    <%@ include file="/WEB-INF/template/headcss.jsp"%>

    <!-- Google Fonts로 느낌 살리기 -->
    <link href="https://fonts.googleapis.com/css2?family=Pretendard&display=swap" rel="stylesheet">
    <style>
        body {
            font-family: 'Pretendard', sans-serif;
            background-color: #f8f9fa;
            color: #212529;
        }

        .login-container {
            max-width: 400px;
            margin: 80px auto;
            padding: 40px;
            background-color: white;
            border-radius: 20px;
            box-shadow: 0 4px 30px rgba(0, 0, 0, 0.08);
        }

        .login-title {
            font-size: 28px;
            font-weight: 600;
            text-align: center;
            margin-bottom: 30px;
            color: #2f4f4f;
        }

        .form-control {
            height: 48px;
            border-radius: 10px;
            font-size: 16px;
        }

        .btn-login {
            background-color: #2f4f4f;
            color: white;
            height: 48px;
            border-radius: 10px;
            font-size: 16px;
            font-weight: 500;
            transition: background-color 0.3s;
        }

        .btn-login:hover {
            background-color: #1e3636;
        }

        .text-link {
            display: block;
            text-align: center;
            margin-top: 15px;
            color: #2f4f4f;
            font-weight: 500;
            text-decoration: none;
        }

        .text-link:hover {
            text-decoration: underline;
        }
    </style>
</head>
<body>

    <div class="login-container">
        <div class="login-title">로그인</div>
        <form action="user" method="post">
            <input type="hidden" name="act" value="login">
            <div class="mb-3">
                <input type="text" name="userId" class="form-control" placeholder="아이디" required>
            </div>
            <div class="mb-3">
                <input type="password" name="userPassword" class="form-control" placeholder="비밀번호" required>
            </div>
            <button type="submit" class="btn btn-login w-100">로그인</button>
        </form>
        <a href="user?act=registform" class="text-link">아직 회원이 아니신가요? 회원가입</a>

        <%-- 로그인 실패 시 alert --%>
        <%
            String errorMessage = (String) request.getAttribute("errorMessage");
            if (errorMessage != null) {
        %>
        <script type="text/javascript">
            alert("<%= errorMessage %>");
        </script>
        <%
            }
        %>
    </div>

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
