package com.xworkz.webSeries.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 1, urlPatterns = "/watching")
public class WebSeriesServlet extends HttpServlet {

	public WebSeriesServlet() {
		System.out.println("Created..." + this.getClass().getSimpleName());
	}

	@Override
	public void init() throws ServletException {
		System.out.println("Running init in WebSeriesServlet");
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Running do get in WebSeriesServlet");

		String name = req.getParameter("webSeriesName");
		String lang = req.getParameter("webSeriesLang");
		String episodes = req.getParameter("webSeriesEpisodes");
		String ott = req.getParameter("webSeriesOTT");
		String budget = req.getParameter("webSeriesBudget");

		System.out.println(name);
		System.out.println(lang);
		System.out.println(episodes);
		System.out.println(ott);
		System.out.println(budget);

		PrintWriter writer = resp.getWriter();
		writer.print("<html>");
		writer.print("<body>");
		writer.print("<h1>");
		writer.print("<span style='color:blue'>");
		writer.print("Web series name " + name + " is sent successfully");
		writer.print("</span>");
		writer.print("</h1>");
		writer.print("<h1>");
		writer.print("<span style='color:blue'>");
		writer.print("Web series language " + lang + " is sent successfully");
		writer.print("</span>");
		writer.print("</h1>");
		writer.print("<h1>");
		writer.print("<span style='color:blue'>");
		writer.print("Web series episodes " + episodes + " is sent successfully");
		writer.print("</span>");
		writer.print("</h1>");
		writer.print("<h1>");
		writer.print("<span style='color:blue'>");
		writer.print("Web series ott " + ott + " is sent successfully");
		writer.print("</span>");
		writer.print("</h1>");
		writer.print("<h1>");
		writer.print("<span style='color:blue'>");
		writer.print("Web series budget " + budget + " is sent successfully");
		writer.print("</span>");
		writer.print("</h1>");
		writer.print("</body>");
		writer.print("</html>");
		resp.setContentType("text/html");
	}

	@Override
	public void destroy() {
		System.out.println("Running destroy");
	}
}
