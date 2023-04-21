package controller;

import java.util.ArrayList;
import java.util.Map;

public class FrontController {
	
	// 역할 : 모든 요청을 받아서 실행 Controller 실행 요청
	// 실행 Controller를 모두 가지고 있어야 한다!
	
	Map<Integer, Controller> menu;
	Controller[] memns;
	ArrayList<Controller> menus1;

	public FrontController() {
		menus1.add(DeptListController.getInstance());
	}
}
