package book.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import book.service.BookListService;
import book.util.BookDTO;

@WebServlet("/study_book/list")
public class BookListController extends HttpServlet {
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		System.out.println("Get으로 잘 들어왔어요!");
		
		// 서비스를 통해서 DB의 값을 가지고 온다.
		BookListService ListService = new BookListService();
		List<BookDTO> list = ListService.selectService();
		
		// 정보들을 request라는 상자에 담아서
		request.setAttribute("bookList", list);
		
		// 넘겨준다.
		String viewPath = "/WEB-INF/views/list.jsp"; // 보낼 주소
		RequestDispatcher dispatcher = request.getRequestDispatcher(viewPath); // 이 경로로
		dispatcher.forward(request, response); // 보내준다.
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
