package array;

public class Student {

	// 학생이름, 국어점수, 영어점수, 수학점수를 저장하는 변수를 정의 합니다.
	private String studentName;
	private int korScore;
	private int engScore;
	private int mathScore;
	
	public Student(String studentName, int korScore, int engScore, int mathScore) {
		super();
		this.studentName = studentName;
		this.korScore = korScore;
		this.engScore = engScore;
		this.mathScore = mathScore;
	}
	
	public Student() {
		
	}


	//변수는 캡슐화를 합니다. getter/setter 메소드를 정의합니다.
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int getKoreanScore() {
		return korScore;
	}
	public void setKoreanScore(int korScore) {
		this.korScore = korScore;
	}
	public int getEnglishScore() {
		return engScore;
	}
	public void setEnglishScore(int engScore) {
		this.engScore = engScore;
	}
	public int getMathScore() {
		return mathScore;
	}
	public void setMathScore(int mathScore) {
		this.mathScore = mathScore;
	}
	
	// 총점 계산해서 반환하는 메소드
	private int sum() {
		return korScore + engScore + mathScore;
	}
	// 평균 계산해서 반환하는 메소드
	private float avg() {
		return sum()/3f;
	}
	
	public String result() {
		return studentName +"\t"+korScore +"\t"+ engScore +"\t" + mathScore +"\t"+sum() +"\t" +avg();
	}
	
	
	@Override
	public String toString() {
//		return "학생 [이름=" + studentName + ", 국어점수=" + korScore + ", 영어점수=" + engScore
//				+ ", 수학점수=" + mathScore + ", 총점="+ studentName + korScore + engScore + mathScore + ", 평균=""]";
		return result();
	}

	
	
	
	
	

}
