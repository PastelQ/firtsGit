package ch061_FieldConstructor;
//this() 사용 
/* 마지막 초기화가 되어 있는 부분만 남기고 this()를 이용
 * 중복되는 코드 제거
 - Overloading02(String model,int maxSpd){
		this.model = model;
		this.maxSpd = maxSpd; 
 */

public class Overloading02 {

	String brand = "KIA MOTORS";
	String model;
	int maxSpd;
	
	Overloading02(){
	}
	
	Overloading02(String model){
		this(model,0);
	}
	Overloading02(String model,int maxSpd){
		this.model = model;
		this.maxSpd = maxSpd;
	}

}
