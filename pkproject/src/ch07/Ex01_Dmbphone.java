package ch07;

public class Ex01_Dmbphone extends Ex01_Cellphone {
	
	int channel;
	
	Ex01_Dmbphone(String model,String color ,int channel){
		this.model=model;
		this.color=color;
		this.channel=channel;
	}
	
	void dmbOn() {
		System.out.println("DMB를 켭니다");
	}
	void channelChange(int chauuel) {
		this.channel = channel;
		System.out.println("채널을"+channel+"로 변경합니다.");
	}
}
