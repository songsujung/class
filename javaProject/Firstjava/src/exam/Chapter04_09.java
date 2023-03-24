package exam;

public class Chapter04_09 {

	public static void main(String[] args) {
		// 문제 9. for 문을 이용하여 1부터 10까지를 곱해서 그 결과를 출력하는 프로그램을 작성
		
		// 1~10까지의 숫자들의 곱
		
		int result = 1;
		
		for(int i=1; i<=10; i++) { // 1~10까지 나타냄(반복문)
			result *= i; //result = result * i;
		}
		
		System.out.println("1~10까지 숫자들의 곱한 결과 : " + result);
	}

}
