package ch07;

public class Ex03_Computer extends Ex03_Calculator{

	@Override
	double areaCircle(double r) {
		System.out.println("수정된 원의 면적은=");
		return Math.PI * r * r;
	}
}
