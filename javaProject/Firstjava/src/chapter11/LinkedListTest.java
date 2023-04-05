package chapter11;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListTest {

	public static void main(String[] args) {
		
		List<Integer> numbers = new LinkedList<Integer>();
		numbers.add(10);
		numbers.add(20);
		numbers.add(30);
		numbers.add(10);
		numbers.add(20);
		
		// 반복자 : Iterator<E> => Collection<E> 구현하는 객체들의 전체 참조목적으로 사용
		Iterator<Integer> itr = numbers.iterator();
		
		System.out.println("Iterator를 이용한 전체 참조");
		while(itr.hasNext()) {
			//System.out.println(itr.next()); 
			int num = itr.next();
			System.out.println(100 + num);
		}
		
		
		System.out.println("------------------");
		
		
		for( int n : numbers) {
			System.out.println(n);
		}
		
		
		// Collection<E> => List<E> => ArrayList<E>
		// String 타입의 객체를 저장 => String 타입의 인스턴스를 참조하는 참조값을 저장
		LinkedList<String> list = new LinkedList<String>();
		
		// 인스턴스 저장 => 요소 저장, add()메소드 사용
		list.add("손흥민"); // 0번지
		list.add(new String("박지성")); // 1번지
		list.add(new String("이강인")); // 2번지
		
		// 데이터 참조 : get()메소드
		//String name = list.get(0);
		String name = list.get(0);
		System.out.println(name); // 손흥민
		System.out.println(list.get(1)); // 박지성
		
		System.out.println("------------------");
		
		// 특정위치의 요소 삽입
		list.add(1, "안정환"); // 손흥민, 안정환, 박지성, 이강인
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		System.out.println(list.get(3));
		
		System.out.println("------------------");
		
		// 저장된 요소의 개수 : size()
		System.out.println("저장된 이름의 개수 : " + list.size());
		System.out.println("index : 0 ~ " + (list.size()-1));
		
		System.out.println("------------------");
		
		// 반복문을 이용해서 일괄 처리
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i)+ " : " + list.get(i).charAt(0));
		}
		
		System.out.println("------------------");
		
		for(String playerName : list) { // (String 요소타입의 번수 : 집합객체(배열,컬렉션))
			System.out.println(playerName + " : " + playerName.charAt(2));
		}
		
		System.out.println("------------------");
		
		if(list.contains("손흥민")) {
			System.out.println("잘하자~!!!화이팅!!!");
		}
		
		System.out.println("------------------");
		
		if(list.contains("안정환")) {
			// 안정환 선수는 하차!
			list.remove("안정환"); // 손흥민(0번지),박지성(1번지), 이강인(2번지)
			list.remove(0); // 박지성(0번지), 이강인(1번지)
		}
		
		
		for(String playerName : list) { // remove기능 적용되었는지 확인
			System.out.println(playerName + " : " + playerName.charAt(2));
		}
		
		System.out.println("------------------");
		
		//전체요소 삭제
		list.clear();
		System.out.println(list.size());
		System.out.println(list.isEmpty());
				
	}

}

