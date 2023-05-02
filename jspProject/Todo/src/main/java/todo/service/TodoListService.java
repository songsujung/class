package todo.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import todo.dao.TodoDAO;
import todo.domain.TodoDTO;
import todo.util.ConnectionProvider;

public class TodoListService {
	
	TodoDAO dao;

	public TodoListService() {
		this.dao = TodoDAO.getInstance();
	}
	
	private static TodoListService service = new TodoListService();
	
	public static TodoListService getInstance() {
		return service;
	}
	
	public List<TodoDTO> getList(){
		
		// 데이터 처리
		// 트렌젝션 처리
		
		Connection conn = null;
		List<TodoDTO> list = null;
		
		try {
			conn = ConnectionProvider.getConnection();
			//System.out.println("conn : " + conn);
			
			list = dao.selectByAll(conn);
			//System.out.println(list);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if(conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		return list;
		
	}
	

}