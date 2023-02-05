package test.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.List;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
@WebServlet("/register")
public class RegisterServlet implements Servlet {

	@SuppressWarnings("rawtypes")
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		String name= req.getParameter("name");
		String dob= req.getParameter("dob");
		String gender= req.getParameter("gender");
		String qlfy= req.getParameter("qlfy");
		String[] hob= req.getParameterValues("hobb");
		List a1=Arrays.asList(hob);
		
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		
//		add bootstrap 
		pw.println("<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\">\r\n"
				+ "\r\n"
				+ "<!-- Latest compiled JavaScript -->\r\n"
				+ "<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js\"></script>\r\n"
				+ "");
		
//		Print data
		pw.println("<div class=\"card\" style=\"width:600px ;margin:auto; margin-top:50px\">");
		pw.println("<h2 class =\"bg-dark text-light card-header\">Registration Details</h2>");
		pw.println("<table class = ' table table-hover table-striped'>");
		pw.println("<tr>");
		pw.println("<td>Name</td>");
		pw.println("<td>"+name+"</td>");
		pw.println("</tr>");
		
		pw.println("<tr>");
		pw.println("<td>Date of Birth</td>");
		pw.println("<td>"+dob+"</td>");
		pw.println("</tr>");
		
		pw.println("<tr>");
		pw.println("<td>Gender</td>");
		pw.println("<td>"+gender+"</td>");
		pw.println("</tr>");
		
		pw.println("<tr>");
		pw.println("<td>Qualification</td>");
		pw.println("<td>"+qlfy+"</td>");
		pw.println("</tr>");
		
		pw.println("<tr>");
		pw.println("<td>Hobbies</td>");
		pw.println("<td>"+a1+"</td>");
		pw.println("</tr>");
		
		pw.println("</table>");
		pw.println("</div>");
//		pw.println("name"+name+"<br>");
//		pw.println("dob"+dob+"<br>");
//		pw.println("gender"+gender+"<br>");
//		pw.println("Qualification"+qlfy+"<br>");
//		pw.println("Hobbies"+a1+"<br>");
	}
	
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void init(ServletConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		
	}



}
