package Ch11_Interface;

//추상 메서드만 상속, fly인터페이스는 구현받지 않음
public class Inter033_Dog extends Inter0321_AbsClassAnimal{
	
	//추상 메서드 오버라이드 필수
	public void sound() {
		System.out.println("멍멍");
	}
}