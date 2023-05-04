package book.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/list")
public class BookListController extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("BookListController...doGet()...");
		
		
		// service 연결
		
		
		String viewPath = "/WEB-INF/view/list.jsp";
		RequestDispatcher dispatcher = request.getRequestDispatcher(viewPath);
		dispatcher.forward(request, response);
		
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	
	}

}
