package ch08_Interface_abstractClass;

//이 클래스는 Animal abstract클래스의 실행 클래스이다
public class Animal_Main {
	//field
	//constructor
	//method
	public static void main(String[] args) {
		
		//주소가 들어가는 기준으로 했을 때
		//타입[] 배열참조변수 = new 타입[크기];
		//클래스타입 참조변수 = new 클래스명();
		//상위클래스 참조변수 = new 하위클래스명();
		//인터페이스 참조변수 = new 구현클래스();
		
		Cat cat = new Cat();
		cat.sound();  //Animal->Cat의 추상 메서드 호출
		cat.breathe();//Animal 추성클래스의 일반 메서드 호출
		System.out.println("종류는"+cat.kind+"\n");
		
		/*확장에 유연하게 대처하기 위해 부모 클래스인 Animal 타입의
		 변수에 담음(부모는 자식을 품을 수 있음) */
		Animal_P363 dog = new Dog();
		dog.sound();
		dog.breathe();
		System.out.println("종류는"+dog.kind+"\n");
		
		animalSound(dog);
		
		Animal_P363 ani = new Cat();
		animalSound(ani);
	}
	
	public static void animalSound(Animal_P363 animal) {
		System.out.println("부모객체 : ");
		animal.sound();
		System.out.println();
	}
}