package Ch10_Polymorphism;

public class Poly013_Cat extends Poly012_Animal{
	//012 animal 자식 클래스(상속)
	//012 animal 메소드 sound 오버라이드
	@Override
	void sound() {
		System.out.println("야옹");
	}
}
