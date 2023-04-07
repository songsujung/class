package collectionFramework;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetMain {

	public static void main(String[] args) {
		
		// 나의 팀을 구성하고 싶다 -> 선수들을 저장할 수 있는 공간을 생성하고 선수들을 저장
		Set<FootballPlayer> myTeam = new TreeSet<>();
		
		myTeam.add(new FootballPlayer("손흥민", 7, "토트넘", 30));
		myTeam.add(new FootballPlayer("손흥민", 7, "토트넘", 30));
		myTeam.add(new FootballPlayer("이강인", 18, "마요르카", 20));
		myTeam.add(new FootballPlayer("박지성", 7, "맨유", 40));
		myTeam.add(new FootballPlayer("루니", 7, "맨유", 40));
		
		System.out.println("나의 팀 선수 정보");
//		for(FootballPlayer player : myTeam) {
//			player.showInfo();
//		}	
			
		myTeam.stream().forEach((FootballPlayer p) -> p.showInfo()); // 람다식
		
		myTeam.stream().forEach(System.out::println); // myTeam에 저장되어있는 요소인 참조값을 출력
			
		
	}

}
