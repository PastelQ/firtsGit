package ch062_Method;

public class Method01 {

	void turnOn() {
		System.out.println("전원이 켜졌습니다.");
	}
		
	int plus(int x,int y) {
		int result = x+y;
		return result;
	}
	
	double divide(int x,int y) {
		double result = (double)x/(double)y;
		return result;
	}
	
	void turnOff() {
		System.out.println("전원이 꺼졌습니다.");
	}
}
