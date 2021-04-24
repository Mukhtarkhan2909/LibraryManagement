package com.example.LibraryManagement.servlets;

import com.example.LibraryManagement.objects.Books;
import com.example.LibraryManagement.dao.BookDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/AddBook")
public class AddBook extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Books books = new Books();
		books.setCallno(request.getParameter("callno"));
		books.setName(request.getParameter("name"));
		books.setAuthor(request.getParameter("author"));
		books.setPublisher(request.getParameter("publisher"));
		books.setQuantity(Integer.parseInt(request.getParameter("quantity")));
		int i = BookDao.save(books);
		if(i > 0) {
			request.setAttribute("bookDetails", books);
			request.getRequestDispatcher("bookdetails.jsp").forward(request, response);
		} else {
			request.getRequestDispatcher("errorpage.jsp").forward(request, response);
		}
	}

}
