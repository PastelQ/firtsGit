package ch07;

public class Ex04_SuperSonic extends Ex04_Airplane{
	
	String flyModel="Normal";
	
	@Override
	void fly() {
		if(flyModel=="Normal") {
			super.fly();
		}else if(flyModel=="SuperSonic"){
			System.out.println("초음속 비행합니다.");
		}else {
			System.out.println("입력 값이 잘 못 되었습니다.");
		}
	}
}
