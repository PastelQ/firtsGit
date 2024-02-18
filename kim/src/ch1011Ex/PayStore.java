package ch1011Ex;

public class PayStore {
	
	public static PayInterface findPay(String option) {
		if(option.equals("kakao")) {
			return new Kakao();
		}else if(option.equals("naver")) {
			return new Naver();
		}else {
			return new Default();
		}
	}
	
}
