package Ch10_Polymorphism;

//03 Abstract 메인 메소드
public class Poly031_AbstractMain {
	
	public static void main(String[] args) {
	Poly032_AbstractAnimal cat = new Poly033_Cat();
	
	animalSound(cat);
	animalMove(cat);
	}
	
	//추상메서드 sound를 담은 메서드
	private static void animalSound(Poly032_AbstractAnimal animal) {
		System.out.println("울음 소리 시작");
		animal.sound();
		System.out.println("울음 소리 종료\n");
	}
	//추상메서드 move를 담은 메서드
	private static void animalMove(Poly032_AbstractAnimal animal) {
		System.out.println("움직임 시작");
		animal.move();
		System.out.println("움직임 종료");
	}
	/* 정리
	 추상 메서드만 가지고 있는 추상 클래스는 다형성을 위한 부모 타입으로 껍데기 역할
	 만 수행하며 실행 로직을 전혀 가지고 있지 않음
	  - 상속 시 모든 메서드를 오버라이딩 해야 함
	 * 순수 추상 클래스는 규격을 지켜서 구현하도록 강제? 안내하고 있음
	  마치 다음 시간 배울 Interface 처럼.. */
}