package com.rtosystem.controller.admin;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.rtosystem.models.Complaints;
import com.rtosystem.service.RTOSystem;
import com.rtosystem.service.RTOSystemImpl;

/**
 * Servlet implementation class ViewComplaints
 */
@WebServlet("/ViewComplaints")
public class ViewComplaints extends HttpServlet {
	private static final long serialVersionUID = 1L;
 protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	 
	 System.out.println("[C]----ViewComplaints");
	 
		if ((String) request.getAttribute("admin") != null) {
			RTOSystem service = RTOSystemImpl.getInstence();
			ArrayList<Complaints> list=service.getAllComplaints();
			request.setAttribute("complaints", list);
			request.getRequestDispatcher("showComplaints.jsp").forward(request, response);
		}
		else
			response.sendRedirect("index.jsp");
	}

}