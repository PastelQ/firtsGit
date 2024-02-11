package Ch11_Interface;

/* 인터페이스는 다중 구현 가능함
  > 메서드 이름만 있어 하위 클래스에서 오버라이드하여 기능을 모두 구현해야함
   클래스의 경우 다중 상속을 받을 경우 상위클래스가 다중으로 있으면 어떤 기능을 상속
   받아야 하는 지 어려움이 생김 */
public class Inter021_main {

	public static void main(String[] args) {
		Inter022_A a = new Inter024_Child();
		a.methodA();
		a.methodCommon();
		
		Inter023_B b = new Inter024_Child();
		b.methodB();
		b.methodCommon();
	}
	/*methodCommon 같은 경우 인터페이스 A,B 모두 가지고 있어 하위클래스에서
	 한 번만 오버라이드해도 됨(024 Child 클래스 참고)*/
}