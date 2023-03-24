package first;

public class Member {

	public static void main(String[] args) {
		
		// 자기 자신의 이름 출력
		System.out.println("송수정");
		
		// 변수 선언 : 메모리 할당, 저장, 이름으로 참조(주소)
		// ① String 타입의 이름을 저장할 수 있는 변수 name을 정의해봅시다.
		String name; // 변수 선언
		name = "송수정"; //초기화
		
		// ② int 타입의 나이를 저장할 수 있는 변수 age를 정의해봅시다.
		int age = 28; // 변수 선언과 초기화
		
		// ③ double 타입의 키를 저장할 수 있는 변수 height를 정의해봅시다.
		double height = 169.1;
		
		// ④ boolean 타입의 JAVA책의 보유 여부를 저장할 수 있는 변수 hasBook를 정의해봅시다.
		boolean hasBook = true;  //has보유여부 , is존재여부(암묵적 규칙)
		
		// ⑤ 이름과 나이, 키, 책의 보유 여부를 출력해봅시다.
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("신장 : " + height);
		System.out.println("책 보유 여부 : " + hasBook);


	}

}
