package ch08_Interface_abstractClass;

//이 클래스는 RemoteControl_P373의 필드와 기능을 사용하는 실행클래스
//추가로 Searchable_P378 인터페이스의 기능도 필요(인터페이스 2개 구현)
public class RemoteControl_Main {
	
	public static void main(String[] args) {
		//클래스타입 참조변수 = new 클래스();
		//상위클래스 참조변수 = new 하위클래스();
		//인터페이스 참조변수 = new implements(구현)된 클래스();
		
		RemoteControl_P373 rc = null;
		
		rc = new TV_P374();
		//강제형변환 (하위 클래스에 있는 필드값 호출 필요하여)
		TV_P374 tv = (TV_P374)rc;
	
		rc.turnOn(); 
		//MAXVOLUMN을 10으로 설정
		rc.setVolumn(35);
		System.out.println("현재 볼륨은 "+tv.volumn);
		//MINVOLUMN을 0으로 설정
		rc.setVolumn(-10);
		System.out.println("현재 볼륨은 "+tv.volumn);
		rc.setVolumn(5);
		System.out.println("현재 볼륨은 "+tv.volumn);
		rc.turnOff();
		
		System.out.println("\n====== 구분선 ======\n");
		
		
		rc = new Audio_P375();
		Audio_P375 ad = (Audio_P375)rc;
		
		rc.turnOn(); 
		rc.setVolumn(7);
		System.out.println("현재 볼륨은 "+ad.volumn);
		rc.turnOff();
		
		System.out.println("\n====== 구분선 ======\n");
		
		
		/*Searchable_P378,RemoteControl_P373 인터페이스를
		구현, 다중 인터페이스를 구현한 클래스*/
		Searchable_P378 sc = new SmartTV_P378();
		sc = new SmartTV_P378();
		sc.search("http://naver.com");
		sc.search("프로토콜://ip주소:포트번호/컨텍스트패스/디렉토리");
		
		RemoteControl_P373 rc0 = new SmartTV_P378();
		rc0.turnOn(); 
		rc.turnOff();
		
		/* 외부에서 interface의 기능을 호출하게 되면 
		  interface의 메서드를 호출함
		 * but! 내부적으로는 interface의 구현 클래스의 구현 메서드가
		  호출됨*/
		
		System.out.println();
		
		//정적메서드 호출
		RemoteControl_P373.changeBattery();
		//디폴트메서드 호출
		rc.defaultMethod();
	}
}
