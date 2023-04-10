package exam5;

public class Student {
	/*Student 클래스에는 아래 요구사항에 맞는 변수와 메소드를 정의하세요.

	변수: 이름(name), 나이(age), 학년(grade), 학과(major), 학번(studentId), 이메일(email)
	메소드: 생성자(constructor), 정보 출력(printInfo), 학과 변경(setMajor)
	생성자

	이름, 나이, 학년, 학과, 학번, 이메일을 입력받아 각각의 인스턴스 변수를 초기화하는 생성자를 정의하세요.
	정보 출력 메소드

	인스턴스의 이름, 나이, 학년, 학과, 학번, 이메일을 출력하는 메소드를 정의하세요.
	학과 변경 메소드

	학과를 입력받아 인스턴스의 학과를 변경하는 메소드를 정의하세요.
	main() 메소드에서 다음을 수행하세요.

	이름이 "김철수", 나이가 21, 학년이 3, 학과가 "컴퓨터공학", 학번이 "20210001", 이메일이 "kim@example.com"인 인스턴스를 생성합니다.
	정보 출력 메소드를 호출하여 해당 인스턴스의 정보를 출력합니다.
	학과 변경 메소드를 호출하여 학생의 학과를 "전자공학"으로 변경합니다.
	다시 정보 출력 메소드를 호출하여 변경된 정보를 출력합니다. */
	
	private String name;
	private int age;
	private String grade;
	private String major;
	private int studentId;
	private String email;
	
	public Student (String name, int age, String grade, String major, int studentId, String email) {
		this.name = name;
		this.age = age;
		this.grade = grade;
		this.major = major;
		this.studentId = studentId;
		this.email = email;
	}
	
	public void setMajor(String major) {
		this.major = major;
	}
	
	public void printInfo() {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("학년 : " + grade);
		System.out.println("전공 : " + major);
		System.out.println("학번 : " + studentId);
		System.out.println("이메일 : " + email);
	}
	
	
	public static void main(String[] args) {
		Student student = new Student("김철수", 21, "3학년", "컴퓨터공학", 20210001, "kim@example.com");
		student.printInfo();
	}
	

}
