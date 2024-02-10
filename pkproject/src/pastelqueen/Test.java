package pastelqueen;

public class Test {

	public static void main(String[] args) {
		
		int N = 5;

        for (int i = 1; i <= N; i++) {
            // 공백 출력
            for (int j = 1; j <= N - i; j++) {
                System.out.print(" ");
            }

            // 별 출력
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }

            // 줄 바꿈
            System.out.println();
        }
    }
}
