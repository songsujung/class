package chapter06;

public class ArrayTest1 {

	public static void main(String[] args) {
		
		// 배열의 선언
		int[] scores; // int 타입의 배열 인스턴스 주소를 가지는 변수
		
		// 배열의 생성
		scores = new int[10]; // int 타입의 요소 10개를 가지는 배열 인스턴스
		
		for(int i=0; i<scores.length; i++) {
			System.out.println(scores[i]);
		}
		
		System.out.println("============================");
		
		// 배열 요소의 참조
		// 배열이름[intdex]
		// index => 0 ~ 개수-1
		// 요소의 개수 => 배열변수.length
		scores[0] = 64;
		scores[1] = 73;
		scores[2] = 96;
		scores[3] = 57;
		scores[4] = 78;
		scores[5] = 99;
		scores[6] = 100;
		scores[7] = 82;
		scores[8] = 71;
		scores[9] = 78;
		
		int sum = 0; //총합 초기화
		float avg = 0.0f; //평균 초기화
		
		//System.out.println(scores[1]); // 하나씩 입력하는 기본출력
	
		for(int i=0; i<scores.length; i++) {
			System.out.println(scores[i]); 	//for문으로 전체 출력 index값(i) => 0~9
			// 합의 연산
			sum = sum + scores[i]; // 총합
		}
		
		avg = sum/(float)scores.length; // 평균 : ()캐스팅연산자로 형변환 int->float
		
		System.out.println("총점 : " + sum); // 798
		System.out.println("평균 : " + avg); // 79.8
	}
}
