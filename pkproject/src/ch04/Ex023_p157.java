package ch04;

public class Ex023_p157 {
	
	public static void main(String[] args) {
		
		out: for(char upper ='A'; upper<='Z'; upper++) {
				for(char lower='a'; lower<='z';lower++) {
				System.out.println(upper + "-" + lower);
					if(lower>='g') {
					break out;
					}
				}	
		}
	
	}
}
