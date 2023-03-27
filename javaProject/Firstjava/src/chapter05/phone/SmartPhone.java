package chapter05.phone;

public class SmartPhone {
	
	// 인스턴스 변수
	String color; //메모리 공간 할당;
	float size;
	int volume;
	
	// 생성자 : 초기화 메소드, 인스턴스 변수의 초기화 작업
	// 초기화 작업이 없는 경우 생략
	//아래와 같은 생성자 => 기본생성자
	SmartPhone(){
		System.out.println("인스턴스 생성!");
	}
	
	void call() {
		System.out.println("전화 걸기!");
	}
	
	void volumeUp() {
		volume++;
	}
	
	void volumeDown() {
		volume--;
	}
}
