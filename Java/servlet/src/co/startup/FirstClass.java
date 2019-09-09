package co.startup;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class FirstClass extends HttpServlet {
	
	public void doPost(HttpServletRequest req, HttpServletResponse res)
	throws ServletException,IOException
	{	PrintWriter pw = res.getWriter();
		res.setContentType("text/html");
		pw.println("<h1>JOHNSON MANUEL</h1>");
		pw.println("JOHNSON MANUEL WITHOUT H1 TAGS");
		pw.close();
	}

	

}
