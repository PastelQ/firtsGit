package pastelqueen;
//최광현님

public class Test021 {
//Math.random 5개 정수를 받는 경우 범위가 정해지지 않아
//임의로 0~100까지로 정했습니다 ㅠ.ㅠ
	public static void main(String[] args) {
		
		int[] randomArray = new int[5];
		
		for(int i=0;i<randomArray.length;i++) {
			randomArray[i]= (int)(Math.random()*100);
			System.out.print(randomArray[i]+"\s");
		}
		int max = randomArray[0];
		for(int i=0;i<randomArray.length;i++) {
			if(randomArray[i]<max) {
				max = randomArray[i];
			}
		}
		int min = randomArray[0];
		for(int i=0;i<randomArray.length;i++) {
			if(randomArray[i]>min) {
				min = randomArray[i];
			}
		}
		System.out.println("\n");
		System.out.println("가장 큰 수 : " + max);
		System.out.println("가장 작은 수 : " + min);
	}//와 지렸다.. 배열 초기화 때... 향상된 포문은 배열의 각 요소를 직접
	//제공해주는 게 아니라 값을 복사해주는 방식으로 동작해 배열 값 변경을 하려면
	//향상된 for 루프를 사용하면 문제가 발생할 수 있음 gpt말씀..
}
