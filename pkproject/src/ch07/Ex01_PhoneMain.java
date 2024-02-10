package ch07;

public class Ex01_PhoneMain {

	public static void main(String[] args) {
		
		Ex01_Dmbphone dmb = new Ex01_Dmbphone("DMB","Silver",10);
		
		System.out.println("모델은 "+dmb.model);
		System.out.println("컬러는 "+dmb.color);
		System.out.println("채널은 "+dmb.channel);
		
		dmb.turnOn();
		dmb.sendMsg("PastelQueen");
		dmb.channelChange(15);
		dmb.dmbOn();
		
		

	}

}
