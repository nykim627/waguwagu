<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <title>회원가입</title>
    <%@ include file="/WEB-INF/template/headcss.jsp"%>

    <!-- 폰트 & 스타일 -->
    <link href="https://fonts.googleapis.com/css2?family=Pretendard&display=swap" rel="stylesheet">
    <style>
        body {
            font-family: 'Pretendard', sans-serif;
            background-color: #f8f9fa;
            color: #212529;
        }

        .signup-container {
            max-width: 520px;
            margin: 80px auto;
            padding: 40px;
            background-color: white;
            border-radius: 20px;
            box-shadow: 0 4px 30px rgba(0, 0, 0, 0.08);
        }

        .signup-title {
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

        .btn-main {
            background-color: #2f4f4f;
            color: white;
            height: 48px;
            border-radius: 10px;
            font-size: 16px;
            font-weight: 500;
            transition: background-color 0.3s;
        }

        .btn-main:hover {
            background-color: #1e3636;
        }

        .form-check-label {
            margin-right: 15px;
            font-weight: 500;
        }

        .section {
            margin-bottom: 30px;
        }

        .section:last-of-type {
            margin-bottom: 0;
        }

        .input-group input {
            border-radius: 10px 0 0 10px;
        }

        .input-group .btn {
            border-radius: 0 10px 10px 0;
        }
    </style>
</head>
<body>

    <div class="signup-container">
        <div class="signup-title">회원가입</div>

        <!-- 아이디 중복 확인 -->
        <form action="user" method="post" class="section">
            <input type="hidden" name="act" value="checkId">
            <label class="form-label">아이디 중복 확인</label>
            <div class="input-group">
                <input type="text" name="userId" class="form-control" placeholder="아이디 입력" required>
                <button type="submit" class="btn btn-main">중복 확인</button>
            </div>
        </form>

        <!-- 본 회원가입 폼 -->
        <form action="user" method="post">
            <input type="hidden" name="act" value="regist">

            <div class="section">
                <label class="form-label">아이디</label>
                <input type="text" name="userId" class="form-control" placeholder="아이디" required>
            </div>

            <div class="section">
                <label class="form-label">비밀번호</label>
                <input type="password" name="userPassword" class="form-control" placeholder="비밀번호" required>
            </div>

            <div class="section">
                <label class="form-label">이메일</label>
                <input type="email" name="userEmail" class="form-control" placeholder="이메일 주소" required>
            </div>

            <div class="section">
                <label class="form-label">성명</label>
                <input type="text" name="userName" class="form-control" placeholder="성명" required>
            </div>

            <div class="section">
                <label class="form-label d-block">성별</label>
                <div class="form-check form-check-inline">
                    <input class="form-check-input" type="radio" name="userGender" id="male" value="남성">
                    <label class="form-check-label" for="male">남</label>
                </div>
                <div class="form-check form-check-inline">
                    <input class="form-check-input" type="radio" name="userGender" id="female" value="여성">
                    <label class="form-check-label" for="female">여</label>
                </div>
                <div class="form-check form-check-inline">
                    <input class="form-check-input" type="radio" name="userGender" id="idk" value="알 수 없음">
                    <label class="form-check-label" for="idk">알 수 없음</label>
                </div>
            </div>

            <div class="section">
                <button type="submit" class="btn btn-main w-100">회원가입</button>
            </div>
        </form>

        <%-- 회원가입 실패 메시지 처리 --%>
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
