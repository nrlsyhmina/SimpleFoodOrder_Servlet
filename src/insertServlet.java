

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class insertServlet
 */
@WebServlet("/insertServlet")
public class insertServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		String phone = request.getParameter("phone");
		String address = request.getParameter("address");
		String[] nasi = request.getParameterValues("nasi");
		
		String air = request.getParameter("air");
		
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		pw.println("<h2>" + "Name: " + name + "</h2>");
		pw.println("<h2>" + "Phone: " + phone + "</h2>");
		pw.println("<h2>" + "Address: " + address + "</h2>");
		for(String s : nasi)
		{
			pw.println("<h2>" + "Food: " + "<li>" + s + "</li>" + "</h2>");
		}
		
		pw.println("<h2>" + "Drink: " + air + "</h2>");
		
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		String phone = request.getParameter("phone");
		String address = request.getParameter("address");
		String[] nasi = request.getParameterValues("nasi");
		
		String air = request.getParameter("air");
		
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		pw.println("<h2>" + "Name: " + name + "</h2>");
		pw.println("<h2>" + "Phone: " + phone + "</h2>");
		pw.println("<h2>" + "Address: " + address + "</h2>");
		for(String s : nasi)
		{
			pw.println("<h2>" + "Food: " + "<li>" + s + "</li>" + "</h2>");
		}
		
		pw.println("<h2>" + "Drink: " + air + "</h2>");
		
	}

}
