package ch062_Method;

public class Method01_Main {

	public static void main(String[] args) {
		
		Method01 Calculator = new Method01();
		
		Calculator.turnOn();
		
		int result1 = Calculator.plus(5,6);
		System.out.println(result1);
		
		byte x = 20;
		byte y = 10;
		double result2 = Calculator.divide(x,y);
		System.out.println(result2);
		
		Calculator.turnOff();
		
	}
}
