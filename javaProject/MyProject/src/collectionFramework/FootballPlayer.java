package collectionFramework;

import java.util.ArrayList;
import java.util.List;


public class FootballPlayer { // 축구선수의 정보를 저장하는 클래스 : 축구선수 데이터저장 -> 인스턴스 생성
	/* 축구선수 클래스를 만들어 봅시다.
		class FootballPlayer {
 		String name;
 		int number;
 		String team;
 		int age
		}
	 */
	// 1. 축구선수 인스턴스를 저장할 수 있는 List<E> 컬렉션 인스턴스를 생성해서 인스턴스를 저장하고 출력하는 프로그램을 만들어 봅시다.
	
	//캡슐화, 변수선언
	private String name;
	private int number;
	private String team;
	private int age;

	public FootballPlayer(String name, int number, String team, int age) { // 생성자
		super();
		this.name = name;
		this.number = number;
		this.team = team;
		this.age = age;
	}
	
	public FootballPlayer() {} // 기본생성자
	
	
	// getter,setter
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

	//exam2
	@Override
	public int hashCode() {
		return this.age;
	}

	//exam2
	@Override
	public boolean equals(Object obj) {
		
		boolean result = false;
		
		if(obj != null && obj instanceof FootballPlayer) {
			FootballPlayer player = (FootballPlayer)obj;
			result = this.team.equals(player.getTeam()) && this.name.equals(player.getName()) && this.age == player.getAge();
		}	// 문자끼리 비교할떄는 equals() 비교  /  숫자비교는 그냥 == 으로 비교
		
		
		return result;
	}
	
	
	
	@Override
	public String toString() {
		return "FootballPlayer [name=" + name + ", number=" + number + ", team=" + team + ", age=" + age + "]";
	}

	
	public void showInfo() {
		System.out.printf("[%s] %s(%d, %d)\n", this.team, this.name, this.number, this.age);
	}
	
		
}
