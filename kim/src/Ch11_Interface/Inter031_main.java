package Ch11_Interface;

class Inter031_main {

	public static void main(String[] args) {
		Inter0321_AbsClassAnimal dog = new Inter033_Dog();
		Inter034_Bird bird = new Inter034_Bird();
		
		//추상클래스 sound
		animalSound(dog);
		animalSound(bird);
		
		//인터페이스 fly
		flyAnimal(bird);
	}
	
	private static void animalSound(Inter0321_AbsClassAnimal animal) {
		System.out.println("울음 소리를 실행");
		animal.sound();
		System.out.println("울음 소리를 종료");
	}
	
	private static void flyAnimal(Inter0322_Interface_Fly fly) {
		System.out.println("Fly 동작을 시작합니다");
		fly.fly();
		System.out.println("Fly 동작을 종료합니다");
	}
}