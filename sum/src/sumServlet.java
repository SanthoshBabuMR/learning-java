import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class sumServlet extends HttpServlet {
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
		Integer n1 = Integer.parseInt(req.getParameter("n1"));
		Integer n2 = Integer.parseInt(req.getParameter("n2"));

		PrintWriter out = res.getWriter();
		out.println("<html>");
			out.println("<head><title>Result: Sum of two numbers</title></head>");
			out.println("<body>");
				out.println("Sum(" + n1 + ", " + n2 + "): " + (n1 + n2) );
				out.println("<br />");
				out.println("<a href=\"\\sum\">Back to sum</a>");
			out.println("<body>");
		out.println("</html>");
	}
}