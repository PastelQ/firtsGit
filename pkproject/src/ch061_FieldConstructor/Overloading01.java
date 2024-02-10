package ch061_FieldConstructor;

public class Overloading01 {

	String company = "KIA MOTORS";
	String model;
	int maxspd ;
	
	Overloading01(){
		
	}
	
	Overloading01(String model){
		this.model = model;
	}
	
	Overloading01(String model,int maxspd){
		this.model = model;
		this.maxspd= maxspd;
	}
}
