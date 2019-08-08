package com.rtosystem.controller.admin;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.rtosystem.service.RTOSystem;
import com.rtosystem.service.RTOSystemImpl;

/**
 * Servlet implementation class RejectLicenseForm
 */
@WebServlet("/RejectLicenseForm")
public class RejectLicenseForm extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		System.out.println("[C]----RejectLicenseForm");
		if ((String) request.getAttribute("admin") != null) {
			RTOSystem system = RTOSystemImpl.getInstence();
			system.rejectLicense(Integer.parseInt(request.getParameter("id")));
			
			response.sendRedirect("VerifyLicense");
		}
	}

}
