package exam11;

import java.util.ArrayList;

public class Exam1Main {

	public static void main(String[] args) {
		
		// 1. 축구선수 인스턴스를 저장할 수 있는 List<E> 컬렉션 인스턴스를 생성해서 
		// 인스턴스를 저장하고 출력하는 프로그램을 만들어 봅시다.
		ArrayList<FootballPlayer> team = new ArrayList<FootballPlayer>();
		
		team.add(new FootballPlayer("손흥민",7,"토트넘",30));
		team.add(new FootballPlayer("이강인",18,"마요르카",20));
		team.add(new FootballPlayer("박지성",7,"맨유",40));
		team.add(new FootballPlayer("손흥민",7,"토트넘",30));
		team.add(new FootballPlayer("홀란드",9,"맨시티",22));
		
		System.out.println("팀 선수들 정보");
		
		team.stream().forEach((FootballPlayer p) -> p.showInfo()); // 람다식
		team.stream().forEach(System.out::println); // myTeam에 저장되어있는 요소인 참조값을 출력
		

	}

}
