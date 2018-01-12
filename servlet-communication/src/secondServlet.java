import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class secondServlet extends HttpServlet {
	protected void processRequest(HttpServletRequest req, HttpServletResponse res) throws IOException {
		System.out.println("processRequest");
		PrintWriter out = res.getWriter();
		res.setContentType("text/html;charset=UTF-8");
		out.println("<!DOCTYPE html>");
		out.println("<html>");
			out.println("<head><title>Second Servlet</title></head>");
			out.println("<body>");
				out.println("<h3>Second Servlet " + req.getContextPath() + "</h3>");
			out.println("<body>");
		out.println("</html>");

	}
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		System.out.println("doGet");

		String name = req.getParameter("user");
		System.out.println("second servlet: " + name);


		PrintWriter out = res.getWriter();
		processRequest(req, res);
	}
}