package chapter03;

public class Operator10 {

	public static void main(String[] args) {
		
		String str1 = "JAVA";
		String str2 = "programing";
		
		// str1, str2 참조변수이다 => 객체를 가르키는 메모리 주소값 저장 (절대 변하지 않는 이론)
		// 참조변수의 관계연산은 ==,!= 두개만 이루어진다. (주소값은 크다,작다의 개념이 없음)
		
		System.out.println(str1 == str2);
		System.out.println(str1 != str2);
		

	}

}
