package ch05;

public class ArrayCopy02_arraycopy {

	public static void main(String[] args) {
		
		String[] oldStrArray = {"java","array","copy"};
		String[] newStrArray = new String[5];
		
		System.arraycopy(oldStrArray, 0, newStrArray, 0, oldStrArray.length-1);
		
		for(String i : newStrArray) {
			System.out.println(i);
		}
		
	}
}
