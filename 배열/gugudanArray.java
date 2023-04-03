
public class gugudanArray {

	public static void main(String[] args) {

		// 아래 배열 선언을 그대로 사용하여, 해당 배열에 구구단의 결과를 할당하고
		// 이를 출력하는 프로그램을 작성하세요.

		int[][] res = new int[8][9];

		// 구구단 값 만들기

		int[][] guguDan = new int[8][9];

		for (int i = 1; i < 9; i++) {
			for (int j = 1; j < 10; j++) {
				guguDan[i - 1][j - 1] = i * j;
			}
		}

		// res 배열에다가 값 할당

		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 9; j++) {
				res[i][j] = guguDan[i][j];
			}
		}

		// res 배열 출력

		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 9; j++) {
				System.out.print("res[" + i + "][" + j + "]=" + res[i][j] + "	");
			}
			System.out.println();
		}

	}

}