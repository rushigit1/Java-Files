package com.java;
import java.io.IOException;
public class Servlet extends HttpServlet {
	@Override
	public void service(ServletRequest req, ServletResponse res) throws Servletexception
	PrintWriter pw = res.getWriter();
	res.setContentType("text/html");
	pw.println("<h1>Hello this is rushi</h1>");
	System.out.println("Hello this is rushi");
}
}
