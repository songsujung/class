package member.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginController
 */
@WebServlet("/login")
public class LoginController extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("LoginController...doGet()...");
		
	    request.getRequestDispatcher("/WEB-INF/views/member/loginForm.jsp").forward(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("LoginController...doPost()...");
		
		// 사용자가 입력한 id/pw를 받아서 인증처리
		String mid = request.getParameter("mid");
		String pw = request.getParameter("pw");
		String reid = request.getParameter("reid");
		System.out.println("reid : " + reid);
		
		// 현재 세션 정보 획득
		HttpSession session = request.getSession();
		
		// 인증처리 : id와 pw가 같은 문자열일 때 인증되었다!라고 판단해보자.
		if(mid.equals(pw)) {
			// 회원이다! -> HttpSession 객체에 회원정보를 저장하자.
			// 저장된 회원정보는 회원이 로그인 했다의 판단기준으로 사용
			session.setAttribute("loginInfo", mid);
			
			// reid값이 on이면 쿠키를 저장
			if(reid != null && reid.equals("on")) {
				Cookie cookie = new Cookie("reid", mid);
				cookie.setMaxAge(60*60*24*180);
				cookie.setPath("/");
				response.addCookie(cookie);
			} else {
				Cookie cookie = new Cookie("reid", "aa");
				cookie.setMaxAge(0);
				cookie.setPath("/");
				response.addCookie(cookie);
			}
			
			response.sendRedirect("/app/index.jsp");
			// return ;
		} else {
			System.out.println("인증실패");
			response.sendRedirect("/app/login");
		}
	}

}
