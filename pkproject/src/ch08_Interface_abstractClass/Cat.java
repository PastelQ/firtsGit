package ch08_Interface_abstractClass;

public class Cat extends Animal_P363{
	//보이지는 않으나 상속받은 field,method 존재
	
	//생성자
	public Cat() {
		this.kind = "고양이과";
	}
	
	//추상메서드는 필수로 오버라이드해야 함
	@Override
	public void sound() {
		System.out.println("야옹");
	}
}