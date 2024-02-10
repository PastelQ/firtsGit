package ch062_Method;

public class Method02_Main {
//매개 변수의 갯수를 모를 경우 > 배열로 처리 (...의 활용)
	
	public static void main(String[] args) {
		Method02 computer = new Method02();
		

		int[] a = {1,2,3};
		int result1 = computer.sum1(a);
		System.out.println(result1);
		
		int result2 = computer.sum1(new int[]{1,2,3,4,5});
		System.out.println(result2);
		
		//...으로 처리할 경우 ()매개변수 입력
		int result3 = computer.sum2(1,2,3);
		System.out.println(result3);
		
		int result4 = computer.sum2(1,2,3,4,5);
		System.out.println(result4);
	}
}
