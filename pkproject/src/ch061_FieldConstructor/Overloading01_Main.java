package ch061_FieldConstructor;

public class Overloading01_Main {

	public static void main(String[] args) {
		
		Overloading01 car1 = new Overloading01();
		System.out.println(car1.company);
		System.out.println(car1.model);
		System.out.println(car1.maxspd);
		
		
		Overloading01 car2 = new Overloading01("Truck");
		System.out.println(car2.company);
		System.out.println(car2.model);
		System.out.println(car2.maxspd);
		
		
		Overloading01 car3 = new Overloading01("Taxi",200);
		System.out.println(car3.company);
		System.out.println(car3.model);
		System.out.println(car3.maxspd);

	}

}
