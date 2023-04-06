package chapter11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class CollectionsTest {


	public static void main(String[] args) {
		
		List<Integer> lottoNumbers = new ArrayList<>();
		for(int i=0; i<6; i++) {
			int n = new Random(System.nanoTime()).nextInt(45)+1; // 무작위로 숫자 출력
			lottoNumbers.add(n);
		}
		
		System.out.println("최초 입력 데이터. ");
		displayList(lottoNumbers);
		
		
		System.out.println("최대 값 : " + Collections.max(lottoNumbers));
		System.out.println("최대 값 : " + Collections.min(lottoNumbers));
		
		Collections.sort(lottoNumbers); // 오름차순
		displayList(lottoNumbers);
		
		Collections.reverse(lottoNumbers); // 내림차순
		displayList(lottoNumbers);
		
		Collections.shuffle(lottoNumbers); // 섞기
		displayList(lottoNumbers);
		
	}
	
	static <E> void displayList(List<E> list) {
		System.out.println("-------------------------");
		for(E num : list) {
			System.out.println(num);
		}
		
	}

}
