package com.example.LibraryManagement.servlets;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/AddBookForm")
public class AddBookForm extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		try {
			response.setContentType("text/html");


			request.getRequestDispatcher("header.jsp").include(request, response);
			request.getRequestDispatcher("navlibrarian.jsp").include(request, response);

			out.println("<div class='container'>");
			request.getRequestDispatcher("addbookform.jsp").include(request, response);
			out.println("</div>");


			request.getRequestDispatcher("footer.jsp").include(request, response);
			out.close();
		}
		catch (IOException e) {
			out.println("<h3>An IOException occurred</h3>");
		}
	}

}
