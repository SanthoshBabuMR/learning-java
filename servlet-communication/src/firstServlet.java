import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class firstServlet extends HttpServlet {
	protected void processRequest(HttpServletRequest req, HttpServletResponse res) throws IOException {
		System.out.println("processRequest");
		PrintWriter out = res.getWriter();
		res.setContentType("text/html;charset=UTF-8");
		out.println("<!DOCTYPE html>");
		out.println("<html>");
			out.println("<head><title>First Servlet</title></head>");
			out.println("<body>");
				out.println("<h3>First Servlet " + req.getContextPath() + "</h3>");
			out.println("<body>");
		out.println("</html>");

	}
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		System.out.println("doGet");
		PrintWriter out = res.getWriter();
		
		String name = req.getParameter("user");
		System.out.println("first servlet: " + name);
		
		// Redirection using RequestDispatcher
		RequestDispatcher rd = req.getRequestDispatcher("SecondServlet");
		rd.forward(req, res);

		// Redirection using browser
		// res.sendRedirect("SecondServlet");


		// processRequest(req, res);
	}
}