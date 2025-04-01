package com.waguwagu.controller;

import java.io.IOException;

import com.waguwagu.service.VideoPickService;
import com.waguwagu.service.VideoPickServiceImpl;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/videoPick")
public class VideoPickController extends HttpServlet {

	private static final long serialVersionUID = 1L;
	private VideoPickService service = VideoPickServiceImpl.getInstance();

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String act = request.getParameter("act");
		
		switch(act) {
		case "add":
			doAddPick(request, response);
			break;
		case "remove":
			doRemovePick(request, response);
			break;
		case "getPickedVds":
			doGetPickedVideos(request, response);
			break;
		case "isPicked":
			doIsPicked(request, response);
		default:
			response.sendError(HttpServletResponse.SC_BAD_REQUEST, "Invalid action");
			break;
		}

	}

	private void doAddPick(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		
	}

	private void doRemovePick(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		
	}
	
	private void doGetPickedVideos(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
	}

	private void doIsPicked(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		
	}

}
