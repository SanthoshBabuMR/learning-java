import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class greetServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		PrintWriter out = res.getWriter();
		out.println("Hello World");
	}
}