package Ch11_Interface;

/*기능을 상속 받지 않아(껍데기만 있음) extends(상속) 대신 implements(구현)을
  사용함, 하위 클래스에서 어떻게 작동하는 지 모두 구현이 필요 */
public class Inter013_Cat implements Inter012_InterfaceAnimal{
	
	@Override
	public void sound(){
		System.out.println("야옹");
	}
	
	@Override
	public void move() {
		System.out.println("고양이가 움직입니다");
	}
	
}
