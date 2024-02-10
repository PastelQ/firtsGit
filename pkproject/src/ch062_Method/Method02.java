package ch062_Method;

public class Method02 {
//매개 변수의 갯수를 모를 경우 > 배열로 처리 (...의 활용)
	
	int sum1 (int[] result){
		int sum = 0;
		for(int i=0;i<result.length;i++) {
			sum += result[i];
		}
		return sum;
	}
	
	int sum2 (int...result) {
		int sum = 0;
		for(int i=0;i<result.length;i++) {
			sum += result[i];
		}
		return sum;
	}
}
