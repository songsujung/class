package chapter08;

public class NewClass extends AbstractClass {
	// 추상클래스를 상속하면 추상메소드를 멤버로 가지게 된다! -> 현재 추상클래스다!
	
	
	@Override // 추상클래스의 추상메소드를 오버라이딩
	void abstractMethod() {
		System.out.println("추상메소드를 구현했습니다.");
	
	}	
		
}
