package collectionFramework;

import java.util.ArrayList;
import java.util.List;

public class FootballPlayer {
	/* 축구선수 클래스를 만들어 봅시다.
		class FootballPlayer {
 		String name;
 		int number;
 		String team;
 		int age
		}
	 */
	// 1. 축구선수 인스턴스를 저장할 수 있는 List<E> 컬렉션 인스턴스를 생성해서 인스턴스를 저장하고 출력하는 프로그램을 만들어 봅시다.
	
	String name;
	int number;
	String team;
	int age;

	public static void main(String[] args) {
		
		ArrayList<String> player = new ArrayList<String>();
		
		
		player.add("더브라위너");
		player.add(new String("필포든"));
		player.add(new String("홀란드"));
		player.add(new String("칸셀루"));
		player.add(new String("에데르송"));
		
		
		
	}
}
