package exam;

public class Chapter04_06 {

	public static void main(String[] args) {
		// ​문제 6. while 문을 이용해서 1부터 99까지의 합을 구하는 프로그램을 작성.

		int num = 1;
		int sum = 0; // 합을 저장하는 변수 (합의 초기화는 0임)
		
		while(num<100) {
			// 반복 처리하는 문장 : 합을 구하는 연산
			sum += num; // sum = sum + num;
			num++;	
		}
		System.out.println("1~99까지의 합 : " + sum);
		
		
		
		//for문으로도 해보기.
		sum = 0;
		
		for(int i=1; i<100; i++) {
			sum += i;
		}
		System.out.println("1~99까지의 합 : " + sum);

		
		
	}

}