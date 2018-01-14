<%@ page import="java.util.*" %>

<%!
String adminEmail = "";
List(String) styles;
%>

<%
adminEmail = request.getAttribute("adminEmail");
styles = (List<String>) request.getAttribute("styles");
%>

<!DOCTYPE html>
<html>
<head>
	<title>Beer Recommendations</title>
</head>
<body>
	<h1>Beer Recommendations JSP</h1>
	<p>
		<%
			for(String style: styles)
			{
				out.print("<br />try: " + style);
			}
		%>
	</p>
	<a href="./form.html">Back to selection</a>
	<p>
		For any questions/clarifications, please reach us at <a href="mailto:<%= request.getAttribute("adminEmail") %>"><%= request.getAttribute("adminEmail") %></a>  
	</p>
</body>
</html>