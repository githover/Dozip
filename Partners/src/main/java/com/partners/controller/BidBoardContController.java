package com.partners.controller;

import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

//@WebServlet("/BidBoardContController")
public class BidBoardContController implements Action {
	
	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) 
			throws Exception {
		
		ActionForward forward = new ActionForward();
		forward.setRedirect(false);
		forward.setPath("/estimate_request/bid_detail.jsp"); //여기서 만들어놓은 뷰페이지 경로로 넘어간다.
		return forward;
	}
	

}
