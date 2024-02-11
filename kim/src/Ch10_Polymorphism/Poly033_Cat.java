package Ch10_Polymorphism;

//Poly032_AbstractAnimal를 상속하는 자식 클래스
public class Poly033_Cat extends Poly032_AbstractAnimal{
	
	//추상메서드를 오버라이딩 필수
	public void sound() {
		System.out.println("야옹");
	}
	public void move() {
		System.out.println("고양이가 움직입니다");
	}
}
