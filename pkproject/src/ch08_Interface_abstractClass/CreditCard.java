package ch08_Interface_abstractClass;

//This class is implement class of 'Payment' Interface
public class CreditCard implements Payment{
	
	//카드사
	//유효기간
	//할부개월
	
	@Override
	public void pay(int amount) {
		System.out.println(amount+"원을 신용카드로 결제합니다");
	}
}
