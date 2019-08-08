package com.rtosystem.controller.user;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.rtosystem.service.RTOSystem;
import com.rtosystem.service.RTOSystemImpl;

/**
 * Servlet implementation class SubmitComplaint
 */
@WebServlet("/SubmitComplaint")
public class SubmitComplaint extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("[C]----SubmitComplaint");
		String name=request.getParameter("name");
		String number=request.getParameter("number");
		String email=request.getParameter("mail");
		String complaint = request.getParameter("compliant");
		
		RTOSystem system = RTOSystemImpl.getInstence();
		system.registerComplaint(name, number, email, complaint);
		
		String msg="Successfully registered your complaint we will notify updations on "+email+" ";
		request.setAttribute("result", msg);
		request.getRequestDispatcher("replay.jsp").forward(request, response);
	}

}
