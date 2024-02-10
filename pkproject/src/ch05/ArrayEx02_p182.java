package ch05;

public class ArrayEx02_p182 {

	public static void main(String[] args) {
		
		int[] score;
		score = new int[] {80,60,80};
		int sum = 0;
		
		for(int i=0;i<3;i++) {
			sum += score[i];
		}System.out.println(sum);

	//----------------------------
		int sum2 = Array(new int[] {80,60,80});
		System.out.println(sum2);
		
	}
	public static int Array(int[] score) {
		int sum = 0;
		for(int i=0;i<3;i++) {
			sum += score[i];
		}return sum;
	}
}
