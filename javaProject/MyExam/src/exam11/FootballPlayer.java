package exam11;

public class FootballPlayer {

	private String name;
	private int number;
	private String team;
	private int age;
	
	public FootballPlayer(String name, int number, String team, int age) {
		super();
		this.name = name;
		this.number = number;
		this.team = team;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Exam2Set [name=" + name + ", number=" + number + ", team=" + team + ", age=" + age + "]";
	}
	
	//exam1
	public void showInfo() { 
		System.out.printf("[%s] %s(%d, %d)\n", this.team, this.name, this.number, this.age);
	}
	
	
	//exam2
	@Override
	public int hashCode() {
		return this.team.charAt(team.length()-1) % 5;  // 01234 5개의 그룹으로 추리기 위한 역할
	}

	//exam2
	@Override
	public boolean equals(Object obj) {
		
		boolean result = false;
		
		if(obj != null && obj instanceof FootballPlayer) {
			FootballPlayer sp = (FootballPlayer)obj;
			result = team.equals(sp.getTeam()) && name.equals(sp.getName()) && age == sp.getAge();
		}	// 문자끼리 비교할떄는 equals() 비교  /  숫자비교는 그냥 == 으로 비교
		
		System.out.println(result);
		
		return result;
		
		
	}
	
	
		

}
