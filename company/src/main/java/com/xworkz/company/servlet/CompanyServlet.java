package com.xworkz.company.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 1, urlPatterns = "/tenure")
public class CompanyServlet extends HttpServlet {

	public CompanyServlet() {
		System.out.println("Created..." + this.getClass().getSimpleName());
	}

	@Override
	public void init() throws ServletException {
		System.out.println("Running init in CompanyServlet");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Running doPost in CompanyServlet");
		String employeeName = req.getParameter("employeeName");
		String employeeEmail = req.getParameter("employeeEmail");
		String employeeStartPoint = req.getParameter("employeeStartPoint");
		String employeeEndPoint = req.getParameter("employeeEndPoint");
		String employeeGender = req.getParameter("employeeGender");

		System.out.println(employeeName);
		System.out.println(employeeEmail);
		System.out.println(employeeStartPoint);
		System.out.println(employeeEndPoint);
		System.out.println(employeeGender);

		PrintWriter writer = resp.getWriter();
		writer.print("<html>");
		writer.print("<body>");
		writer.print("<h1>");
		if (employeeName.length() > 3 && employeeEmail.length() > 3 && employeeStartPoint.length() > 3
				&& employeeEndPoint.length() > 3) {
			writer.print("<span style='color:green'>");
			writer.print("Sign up succesfully");
			writer.print("</span>");
		} else {
			writer.print("<span style='color:red'>");
			writer.print("Please provide valid Company employee information");
			writer.print("</span>");
		}
		writer.print("</h1>");
		writer.print("<a href=\"index.html\">Home page</a>");
		writer.print("<br>");
		writer.print("<a href=\"location.html\">Location page</a>");
		writer.print("</body>");
		writer.print("</html>");
		resp.setContentType("text/html");
	}
}
