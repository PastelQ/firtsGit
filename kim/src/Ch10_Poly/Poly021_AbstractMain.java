package Ch10_Poly;
//메인 메서드
/*추상 클래스, 메서드는 동물 등 추상적인 개념을 제공(구체적인 고양이, 강아지 등이
  아닌 동물, 탈 것 등)*/
public class Poly021_AbstractMain {
	
	/* 제약 1:실수로 부모객체의 인스턴스를 생성하는 문제를 근본적으로 방지
	(추상클래스 객체 생성 시 컴파일오류)*/
	//Poly022_AbstractAnimal animal = new Poly022_AbstactAnimal();
	
	public static void main(String[] args) {
	Poly022_AbstractAnimal cat = new Poly023_Cat();
	Poly022_AbstractAnimal dog = new Poly024_Dog();
	Poly022_AbstractAnimal cow = new Poly025_Cow();
	
	soundAnimal(cat);
	soundAnimal(dog);
	soundAnimal(cow);
	}
	
	//울음 소리 메서드
	private static void soundAnimal(Poly022_AbstractAnimal animal) {
		System.out.println("울음 소리 메서드 시작");
		soundAnimal(animal);
		System.out.println("울음 소리 메서드 종료");
	}
	/* 정리
	제약 1:실수로 부모객체의 인스턴스를 생성하는 문제를 근본적으로 방지
	(추상클래스 객체 생성 시 컴파일오류)
	제약 2: 자식클래스가 오버라이딩할 메서드를 실수로 오버라이딩하지 않을 경우
	사전 방지*/	
}