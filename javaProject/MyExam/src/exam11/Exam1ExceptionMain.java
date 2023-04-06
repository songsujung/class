package exam11;

import java.util.Scanner;

public class Exam1ExceptionMain {
	
	public static void main(String[] args) {
		// 콘솔에서 사용자 아이디를 입력 받아
		// 정상적인 영문자와 숫자로만 이루어진 값을 입력했는지 확인하는 프로그램을 만들어봅시다.
		//① 사용자 예외 클래스를 정의해서 예외를 발생 시켜 봅시다.
		//② 예외 클래스 이름은 BadIdInputException이라고 정의합시다.
		
		Scanner sc = new Scanner(System.in);

		System.out.println("아이디를 입력하세요.");
		String id = sc.nextLine();
 
		
		try {
		for(int i=0; i<id.length(); i++) {
			char c = id.charAt(i);
			if(!(c>='a' && c<='z'|| c>='A' && c<='z' || c>='0' && c<='9')) {
				Exam1BadIdInputException e = new Exam1BadIdInputException("영문자와 숫자만 입력 가능합니다.");
				throw e;
				
				}
			}
		} catch(Exam1BadIdInputException e) {
			System.out.println(e.getMessage());
			return; // 영문자,숫자가 아닐 시 종료
		}
		
		Scanner sc2 = new Scanner(System.in);
		
		System.out.println("======================");
		System.out.println("태어난 년도를 입력하세요.");
		int year = sc.nextInt();
		
		try {
			if(!(year >=1900 && year <=2023)) {
				Exam1BadIdInputException e = new Exam1BadIdInputException("잘못된 생년월일 입력");
				throw e;
			} 
		}catch (Exam1BadIdInputException e) {
				System.out.println(e.getMessage());
		}
		System.out.println("프로그램을 종료합니다.");		
	}
}