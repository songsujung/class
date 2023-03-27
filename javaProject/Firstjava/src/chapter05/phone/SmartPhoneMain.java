package chapter05.phone;

public class SmartPhoneMain {

	public static void main(String[] args) {

		SmartPhone sp = new SmartPhone();
		SmartPhone sp1 = new SmartPhone();
		SmartPhone sp2 = new SmartPhone();
		SmartPhone sp3 = new SmartPhone();
		
		sp.color = "WHITE";
		sp.size = 4.5f;
		sp.volume = 5;
		
		System.out.println(sp.color);
		System.out.println(sp.size);
		System.out.println(sp.volume);

	}

}
