package Ch10_Poly;

public class Poly023_Cat extends Poly022_AbstractAnimal{
	
	/*만약 022 Animal를 extend하고 추상 메서드를 오버라이드하지 않을 경우
	컴파일 오류가 발생함*/
	
	@Override
	public void sound(){
		System.out.println("야옹");
	}
}
