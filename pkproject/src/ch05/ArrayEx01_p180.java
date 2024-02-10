package ch05;

public class ArrayEx01_p180 {

	public static void main(String[] args) {
		
		int[] score = {87, 90, 50};
			System.out.println(score[0]); //인덱스
			System.out.println(score[1]); //인덱스
			System.out.println(score[2]); //인덱스
			
			int sum = 0;
			for(int i=0;i<3;i++) {
				sum += score[i]; //여기에 배열 인덱스를 변수 지정
				
				}
			System.out.println(sum);
			double avg = (double)sum/score.length; 
			//score.length > score 인덱스 수
			System.out.println(avg); //avg 평균
			
	}

}
