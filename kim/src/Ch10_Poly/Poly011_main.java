package Ch10_Poly;

public class Poly011_main {
	
	//동물의 울음 소리를 호출하는 메인 메서드
	/*이전 중복 코드를 제거하고자, 반복문/배열 등을 이용하였으나 이번에는
	cat, dog, cow는 타입(클래스)가 달라 어려움이 있음
	 > 다형적 참조와 메서드 오버라이딩은 우선권을 가지는 것을 이용하여 하기와
	 같이 작성할 수 있음
	*/
	
	public static void main(String[] args) {
		//다형적 참조, 부모 객체는 자식 객체를 품을 수 있음
		Poly012_Animal cat = new Poly013_Cat();
		Poly012_Animal dog = new Poly014_Dog();
		Poly012_Animal cow = new Poly015_Cow();
		
		//하기 메소드 호출
		/* 012 Animal 부모 객체의 sound를 호출하여도 자식 객체에 sound
		메서드를 오버라이드하여 우선권을 가져 자식 클래스의 오버라이드된 메서드가
		호출됨 */
		animalSound(cat);
		animalSound(dog);
		animalSound(cow);
		
	}
	//sound 메소드를 담을 다른 메소드 생성
	private static void animalSound(Poly012_Animal animal) {
		System.out.println("동물 울음 소리 시작");
		animal.sound();
		System.out.println("동물 울음 소리 종료 \n");
	}
}
	