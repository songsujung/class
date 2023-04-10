package exam5;

public class Person {
	
	/*Person 클래스에는 아래 요구사항에 맞는 변수와 메소드를 정의하세요.

변수: 이름(name), 나이(age), 성별(gender), 전화번호(phoneNumber)
메소드: 생성자(constructor), 정보 출력(printInfo)
생성자

이름, 나이, 성별, 전화번호를 입력받아 각각의 인스턴스 변수를 초기화하는 생성자를 정의하세요.
정보 출력 메소드

인스턴스의 이름, 나이, 성별, 전화번호를 출력하는 메소드를 정의하세요.
main() 메소드에서 다음을 수행하세요.

이름이 "홍길동", 나이가 20, 성별이 "남자", 전화번호가 "010-1234-5678"인 인스턴스를 생성합니다.
정보 출력 메소드를 호출하여 해당 인스턴스의 정보를 출력합니다.*/
	
	private String name;
	private int age;
	private String gender;
	private String phoneNumber;
	
	
	public Person (String name, int age, String gender, String phoneNumber) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.phoneNumber = phoneNumber;
	}
	
	public void printInfo() {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("성별 : " + gender);
		System.out.println("전화번호 : " + phoneNumber);
	}
	
	public static void main(String[] args) {
		Person person = new Person("홍길동", 20, "남자", "010-1234-5678");
		person.printInfo();
	}

}
