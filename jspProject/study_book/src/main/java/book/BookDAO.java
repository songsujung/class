package book;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import book.util.BookDTO;

public class BookDAO {

	// dto = 컬럼명을 만들 상자

	
	// SELECT 조회
	public List<BookDTO> seletByAll() {
		
		List<BookDTO> dtoList = null;
		BookDTO dto = null;
		
		// DB URL : DB연결을 하려면 4가지가 필요함 : DriverManager(DB연결), Connection(DB연결) => 이 둘은 세트
		//                                   PreparedStatement(쿼리를 쓰기 위한), ResultSet(결과값을 볼 수 있게)
		try {
			Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.0.43:3306/project", "himedia", "admin");
			
			PreparedStatement pstmt = conn.prepareStatement("select * from book");
			
			ResultSet rs = pstmt.executeQuery();
			
			dtoList = new ArrayList<>();
			
			while(rs.next()) {
				
				dto = new BookDTO(rs.getInt("bookid"), rs.getString("bookname"), rs.getString("publisher"), rs.getString("price"));
			
				dtoList.add(dto);
			}
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	

		return dtoList;
	}
	
	// INSERT 추가
	
	
	// DELETE 삭제 (행단위로 삭제여서 where절이 꼭 들어가야함)
	
	
	// UPDATE 수정
	
	
	// 확인
	public static void main(String[] args) {
		
		BookDAO book = new BookDAO();
		List<BookDTO> list = book.seletByAll();
		
		for(BookDTO val : list) {
			System.out.println(val);
		}
		
	}
	
	
}
