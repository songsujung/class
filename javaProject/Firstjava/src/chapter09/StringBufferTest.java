package chapter09;

public class StringBufferTest {

	public static void main(String[] args) {

		StringBuffer sb1 = new StringBuffer();
		System.out.println(sb1.capacity());
		
		StringBuffer sb = new StringBuffer("Hello");
		System.out.println(sb);
		System.out.println(sb.capacity());
		
		// append
		//sb.append('~'); // "Hello~"
		//sb.append(" JAVA"); // "Hello~ JAVA"
		sb.append('~').append(" JAVA");
		System.out.println(sb); // "Hello~ JAVA"
		
		sb.delete(5, 7); // 5~(7-1)까지 삭제
		System.out.println(sb);
		
		// insert
		sb.insert(5,  '~');
		System.out.println(sb); // Hello~JAVA
		sb.insert(6, "~! ");
		System.out.println(sb); // Hello~~! JAVA
		sb.insert(sb.length(), false);
		System.out.println(sb); // Hello~~! JAVAfalse
		
		// reverse
		sb.reverse();
		System.out.println(sb);
		
		String result = new String(sb);
		
		System.out.println(result);

	}

}
