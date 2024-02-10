package ch07;

public class Ex04_SuperSonicMain {

	public static void main(String[] args) {
		Ex04_SuperSonic ss = new Ex04_SuperSonic();
		
		ss.takeOff();
		ss.fly();
		ss.flyModel = "SuperSonic";
		ss.fly();
	}
}
