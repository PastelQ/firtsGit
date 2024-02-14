package ch08_Interface_abstractClass;

//이 클래스는 RemoteControl_P373 인터페이스의 구현클래스
//class 클래스명 implements(구현) 인터페이스명 {}
public class Audio_P375 implements RemoteControl_P373{
	//부모클래스의 MAX,min volumn(inherited constant) 존재함
	public int volumn;
	
	@Override
	public void setVolumn(int volumn){
		if(volumn>RemoteControl_P373.MAX_VOLUMN) {
			this.volumn = RemoteControl_P373.MAX_VOLUMN;
		}else if(volumn<RemoteControl_P373.MIN_VOLUMN) {
			this.volumn = RemoteControl_P373.MIN_VOLUMN;
		}else {
			this.volumn = volumn;
		}
	}
	@Override
	public void turnOn() {
		System.out.println("Audio_P375의 trunOn()");
	}
	@Override
	public void turnOff() {
		System.out.println("Audio_P375의 trunOff()");
	}
}
