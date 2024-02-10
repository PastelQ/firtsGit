package ch07;

public class Ex02_Student extends Ex02_Person{
	
	int StudentNo;
	
	Ex02_Student(String name,int ssn,int StudentNo){
		super(name,ssn);
		this.StudentNo = StudentNo;
	}
}
