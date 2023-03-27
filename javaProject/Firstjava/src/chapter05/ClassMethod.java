package chapter05;

public class ClassMethod {
	
	int iv = 10; // 인스턴스 변수
	
	static int cv = 30; // 클래스 변수
	
	// 인스턴스 메소드
	void printNumber1() {
		System.out.println(iv);
		System.out.println(cv);
	}
	
	 static void printNumber2() {
		System.out.println("Class Method");
		
		//printNumber1();
		
		ClassMethod cm = new ClassMethod(); // 인스턴스 생성
		System.out.println(cm.iv); //인스턴스 멤버를 사용하기 위해서는 인스턴스를 생성해주어야 함.
		cm.printNumber1();
	}

	 public static void main(String[] args) {
		 
		// 클래스 메소드의 호출 : 클래스이름.메소드이름()
		 ClassMethod.printNumber2(); // 클래스 내부에서는 ClassMethod. 생략가능
	}
}
