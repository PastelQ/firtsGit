package ch05;

public class ArrayCopy01_for {

	public static void main(String[] args){
		
		int oldarray[] = {1,2,3};
		int newarray[] = new int[5];

		for(int i=0;i<oldarray.length;i++) {
			newarray[i] = oldarray[i];
		}
		
		for(int i=0;i<5;i++) {
			System.out.println(newarray[i]);
		}
	}
		
	
}
