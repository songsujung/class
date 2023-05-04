package todo.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import todo.domain.BookDTO;


public class TodoDAO {

	// TodoDTO 리스트를 반환하는 메소드.
//	public static void selectByAll() throws SQLException {
//
//		// DB URL : DB연결을 하려면 4가지가 필요함 : DriverManager(db연결),Connection(db연결) => 세트 , PreparedStatement(쿼리를 쓰기 위한), ResultSet(결과값을 볼 수 있게)
//		String dbUrl = "jdbc:mysql://localhost:3306/project";
//		Connection conn = DriverManager.getConnection(dbUrl, "himedia", "admin");
//		
//		PreparedStatement pstmt = conn.prepareStatement("select tno, todo from tbl_todo where tno=?");
//		pstmt.setInt(1, 2);
//
//		
//		ResultSet rs = pstmt.executeQuery(); // pstmt안에 들어있는 컬럼들을 rs에 담아준것
//		
//		int tno = rs.getInt("tno");
//		String todo = rs.getString("todo");
//		
//		System.out.println(tno+ " : " + todo);
//
//	}

	public static void main(String[] args) throws SQLException {


		
		
		
		// DB URL : DB연결을 하려면 4가지가 필요함 : DriverManager(db연결),Connection(db연결) => 세트 , PreparedStatement(쿼리를 쓰기 위한), ResultSet(결과값을 볼 수 있게)
//		String dbUrl = "jdbc:mysql://localhost:3306/project";
		Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.0.43:3306/project", "himedia", "admin");
		
		PreparedStatement pstmt = conn.prepareStatement("select * from book where bookid=? or bookid=?");
		pstmt.setInt(1, 4);
		pstmt.setInt(2, 9);

		
		List<BookDTO> bookDto = new ArrayList();
		
		ResultSet rs = pstmt.executeQuery(); // pstmt안에 들어있는 컬럼들을 rs에 담아준것
		
		while (rs.next()) {
			
			int bookid = rs.getInt("bookid");
			String bookname = rs.getString("bookname");
			String publisher = rs.getString("publisher");
			int price = rs.getInt("price");
				
			
			bookDto.add(new BookDTO(bookid, bookname, publisher, price));
	
			
			
			
			
		}
		
		for (BookDTO book : bookDto) {
			System.out.println(book);
		}

	}

}
