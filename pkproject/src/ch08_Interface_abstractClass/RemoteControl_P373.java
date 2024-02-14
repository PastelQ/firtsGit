package ch08_Interface_abstractClass;
//상수(constant)
/*[접근제한자(public) modifier(static final) 생략돼 있음] 타입 필드명
	
	public static final int a = 100; 
	int a = 100; 둘은 동일한 코드 */ 
	
//생성자 X 
//RemoteControl_P373(){} > interface는 생성자를 못 가짐
	
//추상메서드
/*[접근제한자][제한자] 리턴유형 메서드명(매개변수 리스트);
	기본적으로 interface의 메서드는 추상메서드로 인식
	public abstract void test(); 
	 >추상메서드는 바디를 가질 수 없음(중괄호{}) 
	 >interface에서는 public abstract를 생략 가능 */

public interface RemoteControl_P373 {
	//상수
	public static final int MAX_VOLUMN=10;
	public static final int MIN_VOLUMN=0;
	
	//추상메서드 
	public void setVolumn(int volumn);
	public void turnOn();
	public void turnOff();
	
	//정적메서드-[public] static 리턴타입 메서드명(매개변수리스트){}
	//자바8에서 추가된 인터페이스의 새로운 member
	//인터페이스명.메서드() > 인터페이스명을 이용하여 직접 호출 가능한 메서드
	//구현부{}가 있음, 구현클래스에서 Override 불가함
	static void changeBattery() {
		System.out.println("정적메서드-changeBettery()");
	}
	/* default method 선언
	 -자바8에서 추가된 인터페이스의 새로운 멤버
	 -실행블럭{}을 가지고 있는 메소드
	 -default 키워드를 반드시 붙여야 함
	 -기본적으로 public 접근 제한:생략하더라도 컴파일 과정에서 자동 붙음
	 -[public]default 리턴타입 메서드명(매개변수리스트){}
	 -인터페이스에서 제공하는 기본 구현을 가진 메서드 
	 -구현클래스에서 Override(재정의) 가능 */
	default void defaultMethod() {
		System.out.println("나는 defaultMethod()야~");
	}
}