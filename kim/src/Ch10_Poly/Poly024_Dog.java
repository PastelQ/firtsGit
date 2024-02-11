package Ch10_Poly;

public class Poly024_Dog extends Poly022_AbstractAnimal{
	
	/*만약 022 Animal를 extend하고 추상 메서드를 오버라이드하지 않을 경우
	컴파일 오류가 발생함*/
	
	/* 제약 2: 자식클래스가 오버라이딩할 메서드를 실수로 오버라이딩하지 않을 경우
	사전 방지*/
	
	@Override
	public void sound() {
		System.out.println("멍멍");
	}
}