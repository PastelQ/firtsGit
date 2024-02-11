package Ch10_Polymorphism;

//추상클래스, 추상 메서드를 하나라도 포함하고 있으면 추상 클래스로 지정 필요
public abstract class Poly022_AbstractAnimal {
	
	//추상 메서드는 무조건 오버라이딩해야 컴파일 오류 발생하지 않음
	public abstract void sound();
	
	//일반 클래스도 생성 가능함 > 자식클래스가 오버라이딩 필수로 할 필요 없음
	public void move() {
		System.out.println("움직입니다");
	}
}