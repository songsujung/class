package controller;

import domain.Dept;
import main.DeptManagerMain;

public class DeptSearchController {
	
	// Service
	
	public void searchDept() {
		
		// view : 검색 할 부서번호를 사용자로 부터 받는 화면
		int deptno = getDeptNo();
		
		Dept dept = null;
		
	}
	
	// 사용자로부터 번호를 입력 받는 화면
	public int getDeptNo() {
		System.out.println("검색을 시작합니다.");
		System.out.println("검색 할 부서번호를 입력하세요.>>");
		
		String num = DeptManagerMain.sc.nextLine();
		
		return Integer.parseInt(DeptManagerMain.sc.nextLine());
		
		
	}

}
