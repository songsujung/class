package chapter04_qize;

public class chapter04_qize04 {

	public static void main(String[] args) {
        // 문제 4. SwitchBreak.java를 switch문이 아닌, if~else를 사용하는 형태로 변경해 보자.
		
		int n=4;
        
		if (n==1) {
			System.out.println("Simple Java");
		} else if (n==2) {
			System.out.println("Funny Java");
		} else if (n==3) {
			System.out.println("Fantastic Java");
		} else {
			System.out.println("The best programming language");
		}
		
		System.out.println("Do you like coffee?");
			
    }
}

/*class SwitchBreak {

    public static void main(String[] args) {
        int n=3;
        switch(n) {
            case 1:
                System.out.println("Simple Java");
                break;
            case 2:
                System.out.println("Funny Java");
                break;
            case 3:
                System.out.println("Fantastic Java");
                break;
            default:
                System.out.println("The best programming language");
        }
        System.out.println("Do you like coffee?");
    }
}*/