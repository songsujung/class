package chapter11;

public class GenericMethodByType {
	
	public <T> void introduce(T t) {
		System.out.println("안녕하세요. " + t.toString());
	}
	
	public static void main(String[] args) {
		GenericMethodByType byType = new GenericMethodByType();
		
		byType.<String>introduce("1");
		byType.<Integer>introduce(2);
		byType.introduce("3");
		byType.introduce(true);
	}

}
