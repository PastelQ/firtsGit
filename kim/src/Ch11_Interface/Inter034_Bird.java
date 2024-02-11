package Ch11_Interface;

//032 추상클래스, 인터페이스 2가지를 상속/구현 받은 클래스
public class Inter034_Bird extends Inter0321_AbsClassAnimal implements Inter0322_Interface_Fly{
	
	//추상 메서드 오버라이드
	public void sound() {
		System.out.println("짹짹");
	}
	
	//인터페이스 메서드 오버라이드
	public void fly() {
		System.out.println("새가 납니다.");
	}
}
