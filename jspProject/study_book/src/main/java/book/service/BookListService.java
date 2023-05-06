package book.service;

import java.util.List;

import book.BookDAO;
import book.util.BookDTO;

public class BookListService {
	
	public List<BookDTO> selectService() {
		
		BookDAO book = new BookDAO();
		List<BookDTO> list = book.seletByAll();
		
		return list;
	}
	
}
