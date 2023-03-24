package first.member;

public class Person {

	public static void main(String[] args) {
		
		// ① 회원이름을 저장하는 변수
		String memberName = "하예솔";
		
		// ② 회원 전화번호 ( 000-0000-0000 )를 저장하는 변수
		String memberPhoneNumber = "010-1234-5678";
				//memPhoneNm (실무에서 개발자끼리 임의로 정해지기도 함)
		// ③ 회원 주민등록번호 ( 000000-0000000 또는 0000000000000 )를 저장하는 변수
		String personNumber = "9603312111111";
		//long pNum = 9912101111111L;

		System.out.println("이름 : " + memberName);
		System.out.println("나이 : " + memberPhoneNumber);
		System.out.println("신장 : " + personNumber);
		
	}

}
