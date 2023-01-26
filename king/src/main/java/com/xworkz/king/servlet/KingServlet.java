package com.xworkz.king.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 1, urlPatterns = "/war")
public class KingServlet extends HttpServlet {

	public KingServlet() {
		System.out.println("Created..." + this.getClass().getSimpleName());
	}

	@Override
	public void init() throws ServletException {
		System.out.println("Running init in KingServlet");
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Running doGet in KingServlet");
		String name = req.getParameter("kingName");
		String region = req.getParameter("region");
		String noOfQueens = req.getParameter("noOfQueens");
		String dOB = req.getParameter("dateOfBirth");
		String dOD = req.getParameter("dateOfDeath");

		System.out.println(name);
		System.out.println(region);
		System.out.println(noOfQueens);
		System.out.println(dOB);
		System.out.println(dOD);

		PrintWriter writer = resp.getWriter();
		writer.print("<html>");
		writer.print("<body>");
		writer.print("<h1>");
		writer.print("<span style='color:red'>");
		writer.print("King name " + name + " is sent successfully");
		writer.print("</span>");
		writer.print("<h1>");
		writer.print("<span style='color:red'>");
		writer.print("King region " + region + " is sent successfully");
		writer.print("</span>");
		writer.print("<h1>");
		writer.print("<span style='color:red'>");
		writer.print("King noOfQueens " + noOfQueens + " is sent successfully");
		writer.print("</span>");
		writer.print("<h1>");
		writer.print("<span style='color:red'>");
		writer.print("King date of birth " + dOB + " is sent successfully");
		writer.print("</span>");
		writer.print("<h1>");
		writer.print("<span style='color:red'>");
		writer.print("King date of death " + dOD + " is sent successfully");
		writer.print("</span>");
		writer.print("</h1>");
		writer.print("</body>");
		writer.print("</html>");
		resp.setContentType("text/html");
	}
}
