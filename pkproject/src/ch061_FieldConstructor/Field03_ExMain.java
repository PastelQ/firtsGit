package ch061_FieldConstructor;

public class Field03_ExMain {

	public static void main(String[] args) {
		
		Field03_Ex member = new Field03_Ex();
		
		member.name = "최하얀";
		member.age = 23;
		
		System.out.println(member.name + ","+member.age);
	}

}
