package ch08_Interface_abstractClass;

//p556 CollectionFramework

/*배열-장점)하나의 변수에 다수의 갯수 data를 저장
  	  단점)선언된 배열의 크기를 변경할 수 없음 
  	  	  동일한 타입만 가능
  	  	  연속적인 공간에 저장하므로 중간에 삭제가 되면 찾기 어려움
  	  	  */

public class CFEx01_p556 {

	public static void main(String[] args) {
		//정수데이터 5개를 저장하는 배열 arr1을 선언
		//데이터 추가 - 임의 데이터를 추가
		int[] arr1 = new int[]{0,1,2,3,4};
		//데이터 가져오기 - for문
		for(int i=0;i<arr1.length;i++) {
			System.out.println(arr1[i]);
		}
		//변경-가장 첫번째 데이터의 값을 임의데이터로 변경
		arr1[0] = 5;
		//삭제-가장 마지막 데이터를 삭제
		arr1[4] = 0;
		//데이터의 갯수 출력
		System.out.println(arr1.length);
	}
}