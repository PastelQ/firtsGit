package pastelqueen;

public class P_book {
	
	String title = "야채의 종류";    //제목
	String writer = "파프리카";     //저자
	String publisher = "호박출판사"; //출판사
	int    price = 50000;         //가격 
	
	//3. 매개변수 O / 리턴값 X 
	void fly(String spell) {
		//System.out.println(spell+" 학원까지");
	}
	
	//4. 매개변수 O / 리턴값 O
	//타입 메소드명(){ return "값" }
	int oneplusone(int get) {
		int result = get*2;
		return result;
	}
}