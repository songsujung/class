package chapter12;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {

	public static void main(String[] args) {

		String str = "String";
		char ch = 'A';
		char[] charArr = {'b', 'c'};
		
		
		try {
			FileWriter out = new FileWriter("D:\\test\\tset-text.txt");
			
			out.write(str);
			out.write(ch);
			out.write(charArr);
			
			out.close();
			System.out.println("파일에 문자열 입력.");
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}	
		
	}

}
