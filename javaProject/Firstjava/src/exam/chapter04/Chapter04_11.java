package exam.chapter04;

public class Chapter04_11 {

	public static void main(String[] args) {
		// 문제 11. ContinueBasic.java의 내부에 존재하는 while 문을 for 문으로 변경하여 작성

		int count = 0;
		
		for(int i=1; i<100; i++) {
			if(i%5 != 0 || i%7 != 0) { // i%5==0 && i%7==0를 이용하면, continue빼고, {}밖에 나와있는 프린트인과 count++;를 안으로 넣어줌
				continue;
			}
			System.out.println(i);
			count++;
		}
		
		System.out.println("count : " + count);
		
	}

}












/* ﻿class ContinueBasic {

public static void main(String[] args) {
    int num=0;
    int count=0;
    while((num++)<100){
        if(num%5!=0 || num%7!=0)
        continue;
        count++;
        System.out.println(num);
    }
    System.out.println("count: " + count);
}
}*/