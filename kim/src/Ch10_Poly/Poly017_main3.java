package Ch10_Poly;

public class Poly017_main3 {
	
	//코드 더 간결하게 / 배열 animalarr 인덱스 값을 넣어줄 때 new를 사용
	public static void main(String[] args) {
		Poly012_Animal[] animalArr = 
			{new Poly013_Cat(), new Poly014_Dog(), new Poly015_Cow()};
		
		for(Poly012_Animal animalA : animalArr) {
			animalSound(animalA);
		}
	}
	/*for문에 메서드 시작,종료를 하기 메서드에 담아둠으로써 하기 메서드는
	별도 변경 없이 고정됨, 추가로 상속 받은 클래스가 생겨도 이 부분은 변경 필요X
	 * 새로운 기능이 추가되었을 때 변하는 부분이 최소화하는 것이 대부분 좋은 코드
	   변동되는 부분, 변동되지 않는 부분을 잘 구분하는 것이 중요 */
	public static void animalSound(Poly012_Animal animal) {
		System.out.println("동물 울음 소리 메서드 시작");
		animal.sound();
		System.out.println("동물 울음 소리 메서드 종료 \n");
	}
}
