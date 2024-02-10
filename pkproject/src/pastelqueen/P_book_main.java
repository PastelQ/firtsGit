package pastelqueen;

public class P_book_main {

	public static void main(String[] args) {
		
		//P_book 클래스 타입 참조변수 선언
		P_book bookObj; 
		bookObj = new P_book();
		
	//3. 매개변수 O / 리턴값 X
	bookObj.fly("날아서");
	
	//4. 매개변수 O / 리턴값 O
	int returnedValue = bookObj.oneplusone(100);
	System.out.println("1권 당 1권 더 드림 총 "+returnedValue+"권");
	
	}
}
