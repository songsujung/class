package chapter02;

import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {
		
		// 사용자가 키보드 입력할 수 있게 해주는 객체
		Scanner in = new Scanner(System.in);
		
		System.out.println("이름을 입력하세요!! >> ");
		
		String name = in.nextLine();
		System.out.println("안녕하세요! " + name);
		

	}

}
