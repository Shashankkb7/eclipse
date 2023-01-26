package com.xworkz.shirt.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 1, urlPatterns = "/wear")
public class ShirtServlet extends HttpServlet {

	public ShirtServlet() {
		System.out.println("Created..." + this.getClass().getSimpleName());
	}

	@Override
	public void init() throws ServletException {
		System.out.println("Running init in ShirtServlet");
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Running doGet in ShirtServlet");
		String brand = req.getParameter("shirtBrand");
		String color = req.getParameter("shirtColor");
		String fullSleeve = req.getParameter("shirtFullSleeve");
		String size = req.getParameter("shirtSize");
		String fabricCare = req.getParameter("shirtFabricCare");
		String companyName = req.getParameter("shirtCompanyName");
		String ownerName = req.getParameter("shirtCompanyOwnerName");
		String wifeName = req.getParameter("shirtCompanyOwnerWifeName");
		String noOfWifes = req.getParameter("shirtCompanyOwnerNoOfWifes");
		String noOfDaughters = req.getParameter("shirtCompanyOwnerNoOfDaughters");
		String daughterName = req.getParameter("shirtCompanyOwnerDaughterName");
		String ownerPhNo = req.getParameter("shirtCompanyOwnerPhNo");
		String wifePhNo = req.getParameter("shirtCompanyOwnerWifePhNo");
		String daughterPhNo = req.getParameter("shirtCompanyOwnerDaughterPhNo");
		String ownerAlive = req.getParameter("shirtCompanyOwnerAlive");
		String wifeAlive = req.getParameter("shirtCompanyOwnerWifeAlive");
		String location = req.getParameter("shirtCompanyLocation");
		String collarType = req.getParameter("shirtCollarType");
		String price = req.getParameter("shirtPrice");
		String pattern = req.getParameter("shirtPattern");

		System.out.println(brand);
		System.out.println(color);
		System.out.println(fullSleeve);
		System.out.println(size);
		System.out.println(fabricCare);
		System.out.println(companyName);
		System.out.println(ownerName);
		System.out.println(wifeName);
		System.out.println(noOfWifes);
		System.out.println(noOfDaughters);
		System.out.println(daughterName);
		System.out.println(ownerPhNo);
		System.out.println(wifePhNo);
		System.out.println(daughterPhNo);
		System.out.println(ownerAlive);
		System.out.println(wifeAlive);
		System.out.println(location);
		System.out.println(collarType);
		System.out.println(price);
		System.out.println(pattern);

		PrintWriter writer = resp.getWriter();
		writer.print("<html>");
		writer.print("<body>");
		writer.print("<h1>");
		writer.print("<span style='color:black'>");
		writer.print("Shirt brand " + brand + " sent successfully");
		writer.print("</span>");
		writer.print("</h1>");
		writer.print("<h1>");
		writer.print("<span style='color:black'>");
		writer.print("Shirt color " + color + " sent successfully");
		writer.print("</span>");
		writer.print("</h1>");
		writer.print("<h1>");
		writer.print("<span style='color:black'>");
		writer.print("Shirt fullSleeve " + fullSleeve + " sent successfully");
		writer.print("</span>");
		writer.print("</h1>");
		writer.print("<h1>");
		writer.print("<span style='color:black'>");
		writer.print("Shirt fabricCare " + fabricCare + " sent successfully");
		writer.print("</span>");
		writer.print("</h1>");
		writer.print("<h1>");
		writer.print("<span style='color:black'>");
		writer.print("Shirt companyName " + companyName + " sent successfully");
		writer.print("</span>");
		writer.print("</h1>");
		writer.print("<h1>");
		writer.print("<span style='color:black'>");
		writer.print("Shirt ownerName " + ownerName + " sent successfully");
		writer.print("</span>");
		writer.print("</h1>");
		writer.print("<h1>");
		writer.print("<span style='color:black'>");
		writer.print("Shirt wifeName " + wifeName + " sent successfully");
		writer.print("</span>");
		writer.print("</h1>");
		writer.print("<h1>");
		writer.print("<span style='color:black'>");
		writer.print("Shirt noOfWifes " + noOfWifes + " sent successfully");
		writer.print("</span>");
		writer.print("</h1>");
		writer.print("<h1>");
		writer.print("<span style='color:black'>");
		writer.print("Shirt noOfDaughters " + noOfDaughters + " sent successfully");
		writer.print("</span>");
		writer.print("</h1>");
		writer.print("<h1>");
		writer.print("<span style='color:black'>");
		writer.print("Shirt daughterName " + daughterName + " sent successfully");
		writer.print("</span>");
		writer.print("</h1>");
		writer.print("<h1>");
		writer.print("<span style='color:black'>");
		writer.print("Shirt ownerPhNo " + ownerPhNo + " sent successfully");
		writer.print("</span>");
		writer.print("</h1>");
		writer.print("<h1>");
		writer.print("<span style='color:black'>");
		writer.print("Shirt wifePhNo " + wifePhNo + " sent successfully");
		writer.print("</span>");
		writer.print("</h1>");
		writer.print("<h1>");
		writer.print("<span style='color:black'>");
		writer.print("Shirt daughterPhNo " + daughterPhNo + " sent successfully");
		writer.print("</span>");
		writer.print("</h1>");
		writer.print("<h1>");
		writer.print("<span style='color:black'>");
		writer.print("Shirt ownerAlive " + ownerAlive + " sent successfully");
		writer.print("</span>");
		writer.print("</h1>");
		writer.print("<h1>");
		writer.print("<span style='color:black'>");
		writer.print("Shirt location " + location + " sent successfully");
		writer.print("</span>");
		writer.print("</h1>");
		writer.print("<h1>");
		writer.print("<span style='color:black'>");
		writer.print("Shirt collarType " + collarType + " sent successfully");
		writer.print("</span>");
		writer.print("</h1>");
		writer.print("<h1>");
		writer.print("<span style='color:black'>");
		writer.print("Shirt price " + price + " sent successfully");
		writer.print("</span>");
		writer.print("</h1>");
		writer.print("<h1>");
		writer.print("<span style='color:black'>");
		writer.print("Shirt pattern " + pattern + " sent successfully");
		writer.print("</span>");
		writer.print("</h1>");
		writer.print("</body>");
		writer.print("</html>");
		resp.setContentType("text/html");
	}
}
