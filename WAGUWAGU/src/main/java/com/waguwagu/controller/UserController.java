package com.waguwagu.controller;

import java.io.IOException;

import com.waguwagu.service.UserService;
import com.waguwagu.service.UserServiceImpl;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class UserController
 */
@WebServlet("/user")
public class UserController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public UserController() {
        super();
    }
    
    private UserService service = UserServiceImpl.getInstance();
    
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	String act = request.getParameter("act");
    	
    	switch(act) {
    	case "loginform":
    		doLoginForm(request, response);
    		break;
    	case "login":
    		doLogin(request, response);
    		break;
    	case "logout":
    		doLogout(request, response);
    		break;
    	case "registform":
    		doRegistForm(request, response);
    		break;
    	case "regist":
    		doRegist(request, response);
    		break;
    	}
    }

	private void doRegist(HttpServletRequest request, HttpServletResponse response) {
		
	}

	private void doRegistForm(HttpServletRequest request, HttpServletResponse response) {
		
	}

	private void doLogout(HttpServletRequest request, HttpServletResponse response) {
		
	}

	private void doLogin(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		String userId = request.getParameter("userId");
		String userPassword = request.getParameter("userPassword");
		
		System.out.println("ID: "+userId+" PASSWORD: "+userPassword);
		
		if(service.loginUser(userId, userPassword)) {
			//로그인 성공 -> 로그인 성공 후 메인 페이지로 이동
			response.sendRedirect("/main"); 
		}else {
			//로그인 실패 -> 로그인 페이지로 돌아가기
			request.setAttribute("errorMessage", "아이디 또는 비밀번호가 일치하지 않습니다.");
			request.getRequestDispatcher("/WEB-INF/user/loginform.jsp").forward(request, response);
		}
		
	}

	private void doLoginForm(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("/WEB-INF/user/loginform.jsp").forward(request, response);
	}

}
