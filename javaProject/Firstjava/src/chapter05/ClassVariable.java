package chapter05;

public class ClassVariable { //static클래스는 특별한 경우가 아닌 이상 사용할 일이 거의 없음.

	static String name = "KING";
	static int age = 10;
	
	void tellName() {
		System.out.println("나의 이름은 " + name + "입니다.");
	}
	
	void tellAge() {
		System.out.println("나이는 " + age + "살 입니다.");
	}
	
}
