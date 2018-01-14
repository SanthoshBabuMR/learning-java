package com.example;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class ListenerTester extends HttpServlet {
	public void doGet (HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();

		out.println("test context attributes set by listener<br />");

		out.println("<br />");

		Dog dog = (Dog) getServletContext().getAttribute("dog");

		out.println("Dog's breed is: " + dog.getBreed());
	}
}