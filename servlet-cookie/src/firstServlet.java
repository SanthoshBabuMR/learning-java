import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class firstServlet extends HttpServlet {
	protected void processRequest(HttpServletRequest req, HttpServletResponse res) throws IOException {
		System.out.println(":: firstServlet processRequest");
		String user = req.getParameter("user");
		System.out.println("first servlet: " + user);
		PrintWriter out = res.getWriter();
		res.setContentType("text/html;charset=UTF-8");
		out.println("<!DOCTYPE html>");
		out.println("<html>");
			out.println("<head><title>First Servlet</title></head>");
			out.println("<body>");
				out.println("<h3>First Servlet: " + req.getContextPath() + "</h3>");
				out.println("<h3>Welcome " + user + "</h3>");
			out.println("<body>");
		out.println("</html>");

	}
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		System.out.println(":: firstServletdoGet");
		PrintWriter out = res.getWriter();
		
		String user = req.getParameter("user");
		System.out.println("first servlet: " + user);

		Cookie userCookie = new Cookie("user", user);
		res.addCookie(userCookie); 

		// begin: Redirection using browser
		System.out.println("INFO: Redirection using browser");
		res.sendRedirect("SecondServlet");
		// end: Redirection using browser

		// processRequest(req, res);
	}
}