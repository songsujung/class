package cal;

import java.util.Scanner; //Scanner사용

public class calculator {

	public static void main(String[] args) {
		
		// ⑦ main() 메소드를 정의하고 각각의 메소드를 호출해서 결과를 콘솔에 출력해봅시다.
		// ⑧ 콘솔에서 사용자에게 데이터를 받아 메소드를 호출할 때 사용자에게 받은 데이터를 메소드의 매개변수의 인자로 전달하는 코드를 main() 메소드에 추가해봅시다.

		Scanner in = new Scanner(System.in);
		
		System.out.println("첫 번째 숫자를 입력하세요. >>");
		long num1 = in.nextLong();
		
		System.out.println("두 번째 숫자를 입력하세요. >>");
		long num2 = in.nextLong();
		
		System.out.println("연산의 결과 ===========");
		add(num1, num2);
		sub(num1, num2);
		mul(num1, num2);
		div(num1, num2);
		
		System.out.println();
		
		System.out.println("반지름의 길이를 입력하세요. >>");
		double r = in.nextDouble();
		
		System.out.println("원의 둘레 : " + cal1(r));
		System.out.println("원의 넓이 : " + cal2(r));
	}
	
	
		// ① 숫자 두 개를 매개변수의 인자로 전달받아 더하기 메소드를 추가합시다.
		// 반환타입, 메소드 이름, 매개변수, 반환이 있다면 return 반환값
		// 변경
		// ① 정수 두 개를 매개변수의 인자로 전달받아 더하기연산 후 출력하는 메소드를 정의
		static void add(long num1, long num2) {
			System.out.println(num1 + "+" + num2 + "=" + (num1+num2) );
		}
		
		
		// ② 숫자 두 개를 매개변수의 인자로 전달받아 빼기 메소드를 추가합시다.
		// ② 정수 두 개를 매개변수의 인자로 전달받아 빼기연산 후 출력하는 메소드를 정의 (변경)
		static void sub(long num1, long num2) {
			System.out.println(num1 + "-" + num2 + "=" + (num1-num2) );
		}
		
		
		// ③ 숫자 두 개를 매개변수의 인자로 전달받아 곱하기 메소드를 추가합시다.
		// ③ 정수 두 개를 매개변수의 인자로 전달받아 곱하기연산 후 출력하는 메소드를 정의 (변경)
		static void mul(long num1, long num2) {
			System.out.println(num1 + "*" + num2 + "=" + (num1*num2) );
		}
		
		
		// ④ 숫자 두 개를 매개변수의 인자로 전달받아 나누기 메소드를 추가합시다.
		// ④ 정수 두 개를 매개변수의 인자로 전달받아 나누기연산 후 출력하는 메소드를 정의 (변경)
		static void div(float num1, float num2) {
			System.out.println(num1 + "/" + num2 + "=" + (num1/num2) );
		}
		
		
		// ⑤ 실수 반지름 하나를 매개변수의 인자로 전달받아 원의 둘레를 구해 반환하는 메소드를 반환하는 메소드를 정의
		static double cal1(double r) {
			// 2 x π x r
			return 2 * Math.PI * r;
		}
		
		
		// ⑥ 실수 반지름 하나를 매개변수의 인자로 전달받아 원의 넓이를 구해 반환하는 메소드를 반환하는 메소드를 정의
		static double cal2(double r) {
			// π x r x r
			return Math.PI * r * r;
		}

		
}

