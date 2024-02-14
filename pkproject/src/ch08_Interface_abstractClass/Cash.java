package ch08_Interface_abstractClass;

//This class is implement class of 'Payment' Interface
public class Cash implements Payment{
	
	//현금영수증
	@Override
	public void pay(int amount) {
		System.out.println(amount+"원을 현금으로 결제합니다");
	}
}