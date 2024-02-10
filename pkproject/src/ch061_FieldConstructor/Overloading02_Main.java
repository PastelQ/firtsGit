package ch061_FieldConstructor;

public class Overloading02_Main {
// this() 
	
	public static void main(String[] args) {
		
		Overloading02 car1 = new Overloading02();
		System.out.println(car1.brand);		
		System.out.println(car1.model);		
		System.out.println(car1.maxSpd);	
		
		Overloading02 car2 = new Overloading02("트럭");
		System.out.println(car2.brand);		
		System.out.println(car2.model);		
		System.out.println(car2.maxSpd);	

		Overloading02 car3 = new Overloading02("트럭",200);
		System.out.println(car3.brand);		
		System.out.println(car3.model);		
		System.out.println(car3.maxSpd);	
		
	}

}
