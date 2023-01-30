package com.xwoorkz.favPerson.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 1, urlPatterns = "/favourite")
public class FavPersonServlet extends HttpServlet {

	public FavPersonServlet() {
		System.out.println("Created..." + this.getClass().getSimpleName());
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String fname = req.getParameter("first");
		String lname = req.getParameter("last");
		String gender = req.getParameter("gender");
		String reason = req.getParameter("reason");
		String address = req.getParameter("address");

		System.out.println("fname " + fname);
		System.out.println("lname " + lname);
		System.out.println("gender " + gender);
		System.out.println("reason " + reason);
		System.out.println("address " + address);

		RequestDispatcher dispatcher = req.getRequestDispatcher("Display.jsp");
		req.setAttribute("fname", fname);
		req.setAttribute("lname", lname);
		req.setAttribute("gender", gender);
		req.setAttribute("reason", reason);
		req.setAttribute("address", address);
		dispatcher.forward(req, resp);
	}
}
