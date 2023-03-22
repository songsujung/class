package chapter03;

public class Operator14 {

	public static void main(String[] args) {
		
		
		short snum1 = 20;
		short snum2 = 30;
		snum1 += snum2;
		// snum1 = snum1 + snum2; :오류 발생(snum1 + snum2;이 int 타입으로 변환되어 연산), 
		//                         +=(복합대입연산자) 사용시엔 전체가 다 int로 바뀜
		System.out.println(snum1);
		
		
		System.out.println();
		
		
		int num = 10;
		num += 5;  // num=10+5 (num=num+5)
		System.out.println(num);  //15
		num -= 5;  // num=15-5
		System.out.println(num);  //10
		num *= 2;  // 10*2
		System.out.println(num);  //20
		num /= 2;  // 20/2
		System.out.println(num);  //10
		num %= 3;  // 20%3
		System.out.println(num);  // 1
								  // 복합대입연산자
		
		

		
		
		

	}

}
