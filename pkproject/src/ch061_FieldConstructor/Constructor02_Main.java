package ch061_FieldConstructor;

public class Constructor02_Main {

	public static void main(String[] args) {
		Constructor02 k1 = new Constructor02("준영",32);
		System.out.println(k1.nation);
		System.out.println(k1.name);
		System.out.println(k1.age);
		
		Constructor02 k2 = new Constructor02("소영",70);
		System.out.println(k2.nation);
		System.out.println(k2.name); //변수 n으로 넣어 놨지만 필드값으로 불러야함
		System.out.println(k2.age);
		
	}

}
