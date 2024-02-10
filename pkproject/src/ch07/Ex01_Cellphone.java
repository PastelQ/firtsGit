package ch07;

public class Ex01_Cellphone {

	//필드 접제 제 타입 필드명 필드값
	String model;
	String color;
	
	//메서드 접제 제 리턴 메서드명 (매개변수){실행코드}
	void turnOn() {
		System.out.println("전원이 켜집니다.");
	}
	void sendMsg(String msg) {
		System.out.println("메세지를 전송합니다:"+msg);
	}
}
