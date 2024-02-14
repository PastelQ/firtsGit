package ch08_Interface_abstractClass;

//P363 abstract class, method 
/* 추상클래스(abstract class)란?
 -클래스가 설계도라면 추상클래스는 '미완성 설계도'
 -추상메서드(미완성 메서드)를 포함하고 있는 클래스
 -일반메서드가 추상메서드를 호출할 수 있다.(호출할 때 필요한 건 선언부)
 -완성된 설계도가 아니므로 인스턴스를 생성할 수 없음
 -다른 클래스를 작성하는 데 도움을 줄 목적으로 작성됨
 
 * 추상메서드(abstract method)란?
  -선언부만 있고 구현부(body,몸통)가 없는 메서드
  -꼭 필요하지만 자손마다 다르게 구현될 것으로 예상되는 경우에 사용
  -추상클래스를 상속받는 자손클래스에서 추상메서드의 구현부를 완성해야 함 */

//이 클래스는 Dog, Cat클래스의 상위클래스이면서 추상 클래스이다
public abstract class Animal_P363 {
	//필드 (상수 가능)
	public String kind;
	
	/*생성자 가능 but! New연산자로 객체 생성은 안되며 상속을 통해
	  자식클래스만 생성 가능 */
	
	//일반method
	public void breathe() {
		System.out.println("Animal_P363의 breathe");
	}
	
	//추상method
	public abstract void sound();
}