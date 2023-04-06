package test;

public class test3 {

	public static void main(String[] args) {
		 int num1=50;
		 int num2=100;
		 
	     int big = 0;
	     int diff = 0;
	        
	        if(num1<num2) {
	        	big = num2;
	        } else {
	        	big = num1;
	        }
	        
	        if(num1<num2) {
	        	diff = num2-num1;
	        } else {
	        	diff = num1-num2;
	        }
	        
	      System.out.println("큰수 : " + big);
	      System.out.println("두 수의 차 : " + diff);
	    }
	}
