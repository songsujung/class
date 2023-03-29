package array;


public class StudentMain {

	public static void main(String[] args) {
		
		//  Student 타입의 배열을 선언하고, 요소 10개를 저장할 수 있는 배열 인스턴스를 생성해 봅시다.
		Student[] students = new Student[10];
		
		
		// Student 타입의 인스턴스를 생성하고 배열에 저장하는 코드를 정의해봅시다.
		students[0] = new Student("학생1", 93, 93, 94);
		students[1] = new Student("학생2", 83, 83, 83);
		students[2] = new Student("학생3", 73, 73, 73);
		students[3] = new Student("학생4", 63, 63, 64);
		students[4] = new Student("학생5", 53, 53, 54);
		students[5] = new Student("학생6", 90, 90, 90);
		students[6] = new Student("학생7", 80, 80, 80);
		students[7] = new Student("학생8", 70, 70, 70);
		students[8] = new Student("학생9", 60, 60, 60);
		students[9] = new Student("학생10", 50, 50, 50);
		
		
		// 배열에 저장된 Student 타입의 인스턴스의 메소드를 이용해서 모든 데이터를 출력해봅시다
		
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
		System.out.println("=================================================");
		
		for (Student student : students) {
			System.out.println(student);
		}

	}

}
