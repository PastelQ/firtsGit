package ch08_Interface_abstractClass;

//이 클래스는 RemoteControl_P373 인터페이스의 구현클래스
//class 클래스명 implements(구현) 인터페이스명 {}
public class SmartTV_P378 implements RemoteControl_P373, Searchable_P378{
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
		System.out.println("SmartTV_P378의 trunOn()");
	}
	@Override
	public void turnOff() {
		System.out.println("SmartTV_P378의 trunOff()");
	}
	@Override
	public void search(String url) {
		System.out.println(url+"검색.");
	}
	
	@Override
	public void defaultMethod() {
		RemoteControl_P373.super.defaultMethod();
	}
	
}
