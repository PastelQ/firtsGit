package Ch11_Interface;

public abstract class Inter0321_AbsClassAnimal {
	
	//추상 클래스에는 일반 메서드도 생성 가능
	public void move() {
		System.out.println("움직입니다.");
	}
	
	//추상 메서드 생성
	public abstract void sound();
}
