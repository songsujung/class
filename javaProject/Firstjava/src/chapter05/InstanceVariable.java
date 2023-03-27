package chapter05;

public class InstanceVariable {

	/*클래스변수 static*/String name = "KING"; // 인스턴스 변수 name 선언
	int age = 12; // 인스턴스 변수 age 선언
	
	void tellName() {
		System.out.println("나의 이름은 " + name + "입니다."); // 멤버변수인 name을 참조한다.
		// System.out.println("나의 이름은 " + ClassVariable.name + "입니다."); static변수 참조가능
	}
	
	void tellAge() {
		System.out.println("나이는 " + age + "살 입니다."); // 멤버변수인 age를 참조한다.
	}
	
	public static void main(String[] args) {
		
		// 인스턴스 변수는 인스턴스를 생성했을 때 생성 -> 인스턴스가 소멸될 때 소멸
		
		InstanceVariable iv = new InstanceVariable();
		
		System.out.println(iv.name); // 인스턴스 메소드 호출
		System.out.println(iv.age); // 인스턴스 메소드 호출
		
		//...
		
		System.out.println(iv.name);
		System.out.println(iv.age);
		
		//iv = null; //값이 0이 될뿐 name=KING, age=12값이 사라지는 것은 아님
		
		iv.tellName();
		iv.tellAge();
		
		//InstanceVariable.name = ""; //클래스변수(static변수) 생성되었을때 호출시
	}
}
