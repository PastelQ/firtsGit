package ch08_Interface_abstractClass;

//This class needs selling, buying method for shop class
//This class is dependent of 'Payment' Interface
/*이 클래스는 Payment Interface에 의존(dependency)함
   -> 결합도를 낮춤 
  CreditCard Class, Cash Class, 00Pay Class 등의 오버라이딩
  메소드 내용에 변경이 발생하더라도 영향을 받지 않음
   => Shop Class에 미치는 영향이 적어진다(여기서는 없다)
*/

public class Shop {
	//field
	private Payment payment; //null
	
	//constructor field 초기화
	public Shop(Payment payment) {
		this.payment=payment;
	}
	//method
	public void purchase(int amount) {
		payment.pay(amount);
	}
}