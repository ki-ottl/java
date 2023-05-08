import java.util.Arrays;
import java.util.Scanner;

public class Quiz3 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int x = s.nextInt();
		int y = s.nextInt();

		int[][] arr = new int[x + 1][y + 1];

		for (int i = 0; i < x; i++) {
			for (int j = 0; j < y; j++) {
				arr[i][j] = s.nextInt();
			}
		}

		for (int i = 0; i < x; i++) {
			for (int j = 0; j < y; j++) {
				arr[x][j] += arr[i][j];
				arr[i][y] += arr[i][j];
			}
		}

		int t = s.nextInt();

		for (int i = 0; i < t; i++) {

			int x1 = s.nextInt();
			int y1 = s.nextInt();

			int sumX = 0;
			int sumY = 0;

			sumX = arr[x1 - 1][y];
			sumY = arr[x][y1 - 1];

			System.out.println(sumX);
			System.out.println(sumY);

		}

	}

} // 제출
