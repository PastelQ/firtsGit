package ch08_Interface_abstractClass;

public class Dog extends Animal_P363{
	//보이지는 않으나 상속받은 field,method 존재
	
	//생성자
	public Dog() {
		this.kind = "강아지과";
	}
	
	//추상메서드는 필수로 오버라이드해야 함
	@Override
	public void sound() {
		System.out.println("멍멍");
	}
}