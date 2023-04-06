package exam11;

import java.util.HashSet;

public class Exam2Main {

	public static void main(String[] args) {
		
		// 2. 축구선수의 인스턴스가 팀과 이름 그리고 나이가 같으면 같은 선수라 판단하고 입력이 되지 않도록 
		// Set<E> 컬렉션을 이용해서 축구선수 인스턴스를 저장하고 출력하는 프로그램을 만들어 봅시다. 
		HashSet<FootballPlayer> team = new HashSet<FootballPlayer>();
		
		team.add(new FootballPlayer("손흥민",7,"토트넘",30));
		team.add(new FootballPlayer("이강인",18,"마요르카",20));
		team.add(new FootballPlayer("박지성",7,"맨유",40));
		team.add(new FootballPlayer("손흥민",7,"토트넘",30));
		team.add(new FootballPlayer("홀란드",9,"맨시티",22));
		
		System.out.println("팀 선수들 정보");
		for(FootballPlayer player : team) {
			System.out.println(player);
		}
		

	}

}
