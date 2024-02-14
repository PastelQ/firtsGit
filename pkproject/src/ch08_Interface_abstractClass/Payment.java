package ch08_Interface_abstractClass;

//이 인턴페이스는 카드결제와 현금결제의 인터페이스
public interface Payment {
	//상수
	//생성자X
	//추상메서드-지불하다(int 금액)
	void pay(int amount);
}
