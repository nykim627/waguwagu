package com.waguwagu.controller;

import java.io.IOException;

import com.waguwagu.service.ReviewService;
import com.waguwagu.service.ReviewServiceImpl;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class UserController
 */
@WebServlet("/review")
public class ReviewController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ReviewController() {
		super();
	}
	
	private ReviewService service = ReviewServiceImpl.getInstance();
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String act = request.getParameter("act");
		
		switch(act) {
		case "writeform":
			doWriteForm(request, response);
			break;
		case "write":
			doWrite(request, response);
			break;
		case "totallist":
			doTotalList(request, response);
			break;
		case "detail":
			doDetail(request, response);
			break;
		case "remove":
			doRemove(request, response);
			break;
		case "updateform":
			doUpdateForm(request, response);
			break;
		case "update":
			doUpdate(request, response);
			break;
		}
	}

	private void doUpdate(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		
	}

	private void doUpdateForm(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		
	}

	private void doRemove(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		
	}

	private void doDetail(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		
	}

	private void doTotalList(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		
	}

	private void doWrite(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		
	}

	private void doWriteForm(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		
	}
	

}
