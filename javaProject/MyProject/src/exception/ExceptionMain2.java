package exception;

import java.util.Scanner;

public class ExceptionMain2 {
	
	public static void main(String[] args) {
		//2. Scanner 클래스로 태어난 년도를 입력 받을 때 int 타입으로 받도록 합시다. 
		//이때 nextInt() 메소드를 사용하게 되는데 이때 발생하는 예외처리를 하도록 합시다.
		Scanner sc = new Scanner(System.in);
		
		System.out.println("태어난 년도를 입력하세요.");
		int year = sc.nextInt();
		
		try {
			if(!(year >=1900 && year <=2023)) {
				BadIdInputException e = new BadIdInputException("잘못된 생년월일 입력");
				throw e;
			} 
		}catch (BadIdInputException e) {
				System.out.println(e.getMessage());
		}
				
	}
}