<%@ page import="java.util.*" %>

<%!
String adminEmail = "";
%>
<%
adminEmail = (String)request.getAttribute("adminEmail");
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
			List<String> styles = (List<String>) request.getAttribute("styles");
			for(String style: styles)
			{
				out.print("<br />try: " + style);
			}
		%>
	</p>
	<a href="./form.html">Back to selection</a>
	<p>
		For any questions/clarifications, please reach us at <a href="mailto:<%= adminEmail %>"><%= adminEmail %></a>  
	</p>
</body>
</html>