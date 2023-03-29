package chapter06;

public class ArrayTest2 {

	public static void main(String[] args) {
		
		// 배열의 인스턴스 생성
		int[] score1 = {100, 70, 40, 70, 90, 60};
		System.out.println("score1 배열의 사이즈 : " + score1.length); // 6
		for(int i=0; i<score1.length; i++) {
			System.out.println(score1[i]); // 100, 70, 40, 70, 90, 60
		}

		int[] score2 = new int[] {1, 5, 7, 8, 4};
		System.out.println("score2 배열의 사이즈 : " + score2.length); // 5
		for(int i=0; i<score2.length; i++) {
			System.out.println(score2[i]); // 1, 5, 7 ,8, 4
		}
	}

}
