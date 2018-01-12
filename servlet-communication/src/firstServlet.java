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
		
		String user = req.getParameter("user");
		System.out.println("first servlet: " + user);
		
		// begin: Redirection using RequestDispatcher
		// RequestDispatcher rd = req.getRequestDispatcher("SecondServlet");
		// rd.forward(req, res);
		// end: Redirection using RequestDispatcher

		// begin: Redirection using browser
		HttpSession session = req.getSession();
		session.setAttribute("user", user);
		res.sendRedirect("SecondServlet");
		// end: Redirection using browser


		// processRequest(req, res);
	}
}