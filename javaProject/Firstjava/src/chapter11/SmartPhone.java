package chapter11;

import java.util.Set;
import java.util.Comparator;
import java.util.HashSet;

public class SmartPhone implements Comparable<SmartPhone> {
	
	private String name;
	private String phoneNumber;
	
	
	public SmartPhone(String name, String phoneNumber) {
		super();
		this.name = name;
		this.phoneNumber = phoneNumber;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getPhoneNumber() {
		return phoneNumber;
	}


	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}


	@Override
	public String toString() {
		return "SmartPhone [name=" + name + ", phoneNumber=" + phoneNumber + "]";
	}


	@Override
	public int hashCode() {
		// 010-9876-5432 ->  0, 1, 2, 3, 4, 5, 6, 7, 8, 9
		return this.phoneNumber.charAt(phoneNumber.length()-1)%5; // 0 1 2 3 4
	}


	@Override
	public boolean equals(Object obj) { // equals가 논리값을 만듦.
		
		boolean result = false;
		
		if(obj != null && obj instanceof SmartPhone) {
			SmartPhone sp = (SmartPhone)obj;
			result = phoneNumber.equals(sp.getPhoneNumber());
		}
		
		return result; // 반환
	}
	
	
	@Override
	public int compareTo(SmartPhone o) {
		return name.compareTo(o.getName()); //내림차순으로 결과 나옴
	}
		
	
	
	public static void main(String[] args) {
		
		Set<SmartPhone> phones = new HashSet<SmartPhone>();
		
		phones.add(new SmartPhone("손흥민", "010-1234-5678"));
		phones.add(new SmartPhone("박지성", "010-3333-7777"));
		phones.add(new SmartPhone("이강인", "010-1234-5678"));
		phones.add(new SmartPhone("차두리", "010-1234-5679"));
		
//		for(S)}
	
		phones.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
	}

}
