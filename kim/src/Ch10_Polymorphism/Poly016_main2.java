package Ch10_Polymorphism;

public class Poly016_main2 {
	/*해 같은 타입을 가져 배열을 이용하여 
	dog, cat, cow 메서드 호출*/
	public static void main(String[] args) {
		Poly012_Animal cat = new Poly013_Cat();
		Poly012_Animal dog = new Poly014_Dog();
		Poly012_Animal cow = new Poly015_Cow();
		
		//animal array 생성, 인덱스에 각각 cat,dog,cow 저장
		Poly012_Animal[] animalarr = {cat, dog, cow};

		//배열 생성 후 for문을 이용하여 각 자식 클래스의 오버라이딩 메서드 호출
		for(Poly012_Animal animal : animalarr) {
			System.out.println("동물 울음 소리 메서드 시작");
			animal.sound();
			System.out.println("동물 울음 소리 메서드 종료 \n");
		}
	}
}
