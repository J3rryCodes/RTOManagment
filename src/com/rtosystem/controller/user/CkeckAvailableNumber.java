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
 * Servlet implementation class CkeckAvailableNumber
 */
@WebServlet("/CkeckAvailableNumber")
public class CkeckAvailableNumber extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String number = request.getParameter("num");
		RTOSystem system=RTOSystemImpl.getInstence();
		

		  response.setContentType("text/plain"); 
		    response.setCharacterEncoding("UTF-8"); 
		
		  if(system.checkAvailableNumber(number)) {
		  response.getWriter().write("available"); } else {
		  response.getWriter().write("Not available"); }
		 
		
	}

}
