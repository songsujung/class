package chapter04_qize;

public class chapter04_qize03 {

	public static void main(String[] args) {
		// 문제3. CondOp.java를 조건연산자(3항 연산자)를 사용하지 않고, if~else를 사용하는 형태로 변경해 보자.
	
        int num1=50, num2=100;
        int big, diff;
        
        if (num1>num2) { 
        	big = num1;
        	diff = num1-num2;	
        } else {
        	big = num2;
        	diff = num2-num1;
        }
        
        System.out.println(big);
        System.out.println(diff);
        
    }
}



/*class CondOp {
    public static void main(String[] args) {
        int num1=50, num2=100;
        int big, diff;
        big = (num1>num2)? num1:num2;
        System.out.println(big);
        diff = (num1>num2)? num1-num2: num2-num1;
        System.out.println(diff);
    }
}
​*/