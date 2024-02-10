package pastelqueen;

import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
		
		int result = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("첫번째 정수 A를 입력하세요");
		int a = sc.nextInt();
		System.out.println("두번째 정수 B를 입력하세요");
		int b = sc.nextInt();
		
		if(a>b) {
			System.out.println("A는 B보다 큽니다.");
		}else if(a<b){
			System.out.println("B는 A보다 큽니다.");
		}else {
			System.out.println("A와 B는 같은 정수입니다.");
		}
	}
}
