package chapter05;

public class LocalVariable {
	
	void method(int num) {
		// 매개변수는 => 지역변수로 메소드 호출시에 생성 -> 메소드 종료시에 소멸
		
		// 메소드 블록 안에서 선언되는 변수도 지역변수
		// 선언시점에 메모리 생성 -> 메소드가 종료될 때 소멸된다.
		int lv = 10;
		
		if(lv>10) {
			boolean chk = true;
			System.out.println(chk);
		} else {
			boolean chk = false;
			System.out.println(chk);
		}
		// System.out.println(chk); // chk 변수는 if else블록 내에서만 사용가능한 변수
		
		
		
		int i = 0;
		
		for(i=0; i<5; i++) {
			System.out.println(i);
		}
		System.out.println(i); // i가 for문 밖에서 선언되었기 때문에 출력가능
		
		
		
		while(lv<5) {
			int lv2 =100;
			System.out.println(lv2);
			lv++;
		}
		
		System.out.println(lv);
		
		
	}

	void method2(int num) {
		int lv = 10;
	}
	
}
