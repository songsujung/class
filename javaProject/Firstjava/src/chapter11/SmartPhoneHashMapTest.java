package chapter11;

import java.util.HashMap;
import java.util.Set;

public class SmartPhoneHashMapTest {

	public static void main(String[] args) {
		
		HashMap<String, SmartPhone> hashMap = new HashMap<String, SmartPhone>();
		
//		SmartPhone p = new SmartPhone("Spring", "010-1111-2222");
//		hashMap.put(p.getPhoneNumber(), p); // put 저장하는 기능
//		
//		SmartPhone p2 = new SmartPhone("Son", "010-1111-2222");
//		hashMap.put(p.getPhoneNumber(), p2); 
//		// 키값은 중복X(두개의 키를 유지하지않겠다, 오류 발생하지않고 Spring, Son 중에 마지막으로 저장된 키인 Son을 사용)
//		
//		
//		System.out.println(hashMap.get("010-1111-2222"));
//		System.out.println(hashMap.get("010-1111-2221")); // 키값이 없으면 null이 나옴, 런타임시엔 오류생김

		SmartPhone p = new SmartPhone("Spring", "010-1111-2222");
		hashMap.put("ver", p);
		
		SmartPhone p2 = new SmartPhone("Son", "010-1111-2222");
		hashMap.put("programName", p2); 
		// 이름을 다르게 설정하여 오류 발생없이 두 키값 다 출력
		
		System.out.println(hashMap.get("ver"));
		System.out.println(hashMap.get("programName"));
		
		System.out.println("--------------------------------"); // 일괄 출력
		Set<String> keySet = hashMap.keySet();
		for(String keyName : keySet) {
			System.out.println(keyName + " : " + hashMap.get(keyName));
			
		}
	}

}
