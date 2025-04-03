package com.waguwagu.controller;

import java.io.IOException;

import com.waguwagu.dto.User;
import com.waguwagu.service.UserService;
import com.waguwagu.service.UserServiceImpl;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

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
    	System.out.println(act);
    	
    	switch(act) {
    	case "checkId":
    		doCheckId(request, response);
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

	private void doCheckId(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userId = request.getParameter("userId");
		
		//아이디 중복 체크 서비스 호출
		if(service.checkId(userId)) {
			request.setAttribute("errorMessage", "이미 존재하는 아이디입니다.");
			request.getRequestDispatcher("/WEB-INF/user/registform.jsp").forward(request, response);
		}else {
			request.setAttribute("errorMessage", "해당 아이디로 회원가입이 가능합니다.");
			request.getRequestDispatcher("/WEB-INF/user/registform.jsp").forward(request, response);
		}
	}

	private void doRegist(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		String userId = request.getParameter("userId");
		String userPassword = request.getParameter("userPassword");
		String userEmail = request.getParameter("userEmail");
		String userName = request.getParameter("userName");
		String userGender = request.getParameter("userGender");
		
		//회원가입 서비스 호출 (유저 객체 반환)
		User registedUser = new User(userId, userPassword, userName, userGender, userEmail);
		boolean isRegistOK = service.joinUser(registedUser);
		
		System.out.println(registedUser.toString());
		System.out.println(isRegistOK);
		if(isRegistOK) {
			//회원가입 성공 후 로그인 페이지로 이동
			request.setAttribute("errorMessage", "회원가입이 완료되었습니다. 로그인 페이지로 이동합니다.");
			request.getRequestDispatcher("/WEB-INF/user/loginform.jsp").forward(request, response);  // 서버 내부 이동을 위해 포워딩
		}else {
			//회원가입 실패 -> 회원가입 페이지로 돌아가기
			request.setAttribute("errorMessage", "다시 시도해주세요.");
			request.getRequestDispatcher("/WEB-INF/user/registform.jsp").forward(request, response);
		}
	}

	private void doRegistForm(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("/WEB-INF/user/registform.jsp").forward(request, response);
	}

	private void doLogout(HttpServletRequest request, HttpServletResponse response) throws IOException {
		HttpSession session = request.getSession();
		session.removeAttribute("loggedInUser"); //세션에서 유저 정보 제거
		
		//로그아웃 후 메인페이지로 이동
		response.sendRedirect("index.jsp");
	}

	private void doLogin(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		String userId = request.getParameter("userId");
		String userPassword = request.getParameter("userPassword");
		
		System.out.println("ID: "+userId+" PASSWORD: "+userPassword);
		
		//로그인 서비스 호출 (유저 객체 반환)
		User loggedInUser = service.loginUser(userId, userPassword);
		
		if(loggedInUser!=null) {
			//세션 생성 및 유저 정보 저장
			HttpSession session = request.getSession(); //세션 가져오기(없으면 새로 생성)
			session.setAttribute("loggedInUser", loggedInUser); //세션에 유저 정보 저장
			session.setMaxInactiveInterval(30*60); //세션 유지 시간 설정 (30분)

			//로그인 성공 -> 로그인 성공 후 메인 페이지로 이동
			response.sendRedirect("index.jsp"); 
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
