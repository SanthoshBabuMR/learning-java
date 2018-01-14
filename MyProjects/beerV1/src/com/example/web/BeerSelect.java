package com.example.web;

import com.example.model.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;

public class BeerSelect extends HttpServlet {
	public void doPost (HttpServletRequest req, 
		HttpServletResponse res) 
		throws IOException, ServletException {

		// res.setContentType("text/html");
		// PrintWriter out = res.getWriter();
		String c = req.getParameter("color");
		String adminEmail = getServletConfig().getInitParameter("adminEmail");

		BeerExpert be = new BeerExpert();
		List<String> result = be.getBrands(c);
		// for(String beer: result) 
		// {
		// 	out.print("<br />try: " + beer);
		// }

		req.setAttribute("styles", result);
		req.setAttribute("adminEmail", adminEmail);

		RequestDispatcher view = req.getRequestDispatcher("result.jsp");
		view.forward(req, res);
	}
}
