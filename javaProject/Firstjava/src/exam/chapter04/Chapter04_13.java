package exam.chapter04;

public class Chapter04_13 {

	public static void main(String[] args) {
		// 문제 13. 구구단의 짝수 단(2,4,8)만 출력하는 프로그램 작성. 단, 2단은 2x2까지, 4단은 4x4까지, 8단은 8x8 까지 출력

		for(int i=2; i<9; i*=2) { // 증가하는 패턴연산을 곱하기로도 할수 있음. i*=2
			System.out.println(i);
			
			for(int j=1; j<=i; j++) {
				System.out.print(i+"X"+j+"="+i*j+" ");
			}
			
			System.out.println();
		}
	}

}
