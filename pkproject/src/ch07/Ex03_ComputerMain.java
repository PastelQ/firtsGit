package ch07;

public class Ex03_ComputerMain {

	public static void main(String[] args) {
		int r = 10;
		
		Ex03_Calculator calculator = new Ex03_Calculator();
		System.out.println(calculator.areaCircle(r));
		
		Ex03_Computer computer=new Ex03_Computer();
		System.out.println(computer.areaCircle(r));
		
		System.out.println("Thanks");
	}
}
