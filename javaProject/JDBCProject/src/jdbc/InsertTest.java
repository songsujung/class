package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertTest {

	public static void main(String[] args) {
		

		
		try {
			// 1. 드라이버 로드 : Class.forName("클래스의 풀네임");
			// Class.forName("oracle.jdbc.driver.OracleDriver"); // 자바7.0부터는 생략가능
		
			// 2. Connection 객체를 생성 : 연결 정보
			// jdbcUrl
			
			//oracle연결
			String dbUrl = "jdbc:oracle:thin:@localhost:1521:xe";
			Connection conn = DriverManager.getConnection(dbUrl, "hr", "tiger");
		
			// Mysql 연결
			//String dburl = "jdbc:mysql://localhost:3306/project";
			//Connection conn = DriverManager.getConnection(dburl, "himedia", "admin");
			
			
			// 3. Statement / PreparedStatement => sql 실행 요청 메소드
			
			//insert Sql
			String sql = "insert into dept values (?, ?, ?)";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, 50);
			pstmt.setString(2, "개발팀");
			pstmt.setString(3, "서울");
			
			int result = pstmt.executeUpdate();
			
			if(result>0) {
				System.out.println("데이터가 입력되었습니다.");
			}
			
			pstmt.close();
			conn.close();
			
			
			
			
			// 4. select의 결과 데이터는 ResultSet 객체로 받는다.
			
			// 5. ResultSet 객체에서 데이터 추출
			
			
			
			
//	      } catch (ClassNotFoundException e) {
//	         // TODO Auto-generated catch block
//	         e.printStackTrace();
		} 
		catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("연결 실패.....");
			e.printStackTrace();
		}
		


	}

}
