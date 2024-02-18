package ch1011Ex;

public class Default implements PayInterface{

	public boolean pay(int amount) {
		System.out.println("결제 수단이 없습니다.");
		System.out.println(amount + "원 결제를 시도합니다.");
		return true;
	}
}