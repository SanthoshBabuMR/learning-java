import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class secondServlet extends HttpServlet {
	protected void processRequest(HttpServletRequest req, HttpServletResponse res) throws IOException {
		System.out.println(":: secondServlet processRequest");
		String user = req.getParameter("user");
		HttpSession session = req.getSession();

		if(user == null) {
			System.out.println("INFO: Getting user data from cookie");
			Cookie cookies[] = req.getCookies();
			for(Cookie cookie: cookies) {
				if(cookie.getName().equals("user")) {
					user = cookie.getValue();
				}
			}

		} else {
			System.out.println("INFO: Got user data from request");
		}
		System.out.println("INFO: second servlet: " + user);

		PrintWriter out = res.getWriter();
		res.setContentType("text/html;charset=UTF-8");
		out.println("<!DOCTYPE html>");
		out.println("<html>");
			out.println("<head><title>Second Servlet</title></head>");
			out.println("<body>");
				out.println("<h3>Second Servlet: " + req.getContextPath() + "</h3>");
				out.println("<h3>Welcome " + user + "</h3>");
			out.println("<body>");
		out.println("</html>");

	}
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		System.out.println(":: secondServlet doGet");
		PrintWriter out = res.getWriter();
		processRequest(req, res);
	}
}