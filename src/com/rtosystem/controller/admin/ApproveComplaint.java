package com.rtosystem.controller.admin;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.rtosystem.controller.AppProperties;
import com.rtosystem.mail.SendMail;
import com.rtosystem.models.License;
import com.rtosystem.service.RTOSystem;
import com.rtosystem.service.RTOSystemImpl;

/**
 * Servlet implementation class ApproveComplaint
 */
@WebServlet("/ApproveComplaint")
public class ApproveComplaint extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("[C]----ApproveComplaint");

		if ((String) request.getAttribute("admin") != null) {

			int id = Integer.parseInt(request.getParameter("id"));
			RTOSystem service = RTOSystemImpl.getInstence();
			License license = service.getLicenseFormById(id);
			String toAddress = license.getEmail();
			SendMail.send(AppProperties.mailId, AppProperties.mailpass, toAddress, AppProperties.ComplaintMailSubject, AppProperties.ComplaintMailMessage);
			service.verifyLicense(id);
			request.getRequestDispatcher("ViewComplaints").forward(request, response);

		} else
			response.sendRedirect("index.jsp");
	}

}
