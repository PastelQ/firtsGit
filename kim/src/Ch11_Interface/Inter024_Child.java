package Ch11_Interface;

//인터페이스 A,B를 구현하는 하위 클래스
public class Inter024_Child implements Inter022_A, Inter023_B{
	
	//022 A인터페이스의 메서드 오버라이딩
	@Override
	public void methodA(){
		System.out.println("메서드 A를 호출합니다.");
	}
	
	//023 B인터페이스의 메서드 오버라이딩
	@Override
	public void methodB(){
		System.out.println("메서드 B를 호출합니다.");
	}
	
	//022,023 인터페이스 A,B 모두 공통적으로 가지고 있는 메서드로 한 번만 호출
	@Override
	public void methodCommon() {
		System.out.println("공통의 메서드를 호출합니다.");
	}
}
