package Ch11_Interface;

//Interface 및 하위 클래스 Cat의 실행 클래스
/*Interface의 하위클래스에서는 상속이 아닌 구현(implements)를 사용 및 표현
 - 메서드 이름만 있는 설계도로 하위크래스에서 어떻게 작동하는 지는 모두 구현 필요*/

public class Inter011_main {

	public static void main(String[] args) {
		Inter012_InterfaceAnimal cat = new Inter013_Cat();
		
		animalSound(cat);
		animalMove(cat);
	}
	
	private static void animalSound(Inter012_InterfaceAnimal animal) {
		System.out.println("울음소리 동작 시작");
		animal.sound();
		System.out.println("울음소리 동작 종료");
	}

	private static void animalMove(Inter012_InterfaceAnimal animal) {
		System.out.println("움직임 동작 시작");
		animal.move();
		System.out.println("움직임 동작 종료");
	}
/* 인터페이스를 사용하는 이유
 1. 인터페이스의 메서드를 반드시 구현하라는 제약을 줌으로써 이후 하위클래스 추가 및
  구현 시 규격을 제공(메서드 오버라이드 강제, 규격에 맞지 않을 경우 컴파일 에러를
  발생 시켜 이후 실수나 오류 발생을 미연에 방지함
  
 2. 자바에서는 클래스 상속을 단독으로만 상속 가능하나
  인터페이스에서는 다중 상속이 가능하게 함
*/
}