import java.util.Arrays;
import java.util.Scanner;

public class Quiz1 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		String n = s.nextLine();
		int N = Integer.parseInt(n);

		String m = s.nextLine();
		int M = Integer.parseInt(m);

		String k = s.nextLine();
		int K = Integer.parseInt(k);

		int[] arr = new int[N];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = s.nextInt();
		}

		// 내림차순
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}

		int sum = 0;
		int count = 6;

		for (int i = 0; i < arr.length; i++) {
			if (count == 0) {
				break;
			} else if (count == 1) {
				sum = sum + arr[i];
				count = count - 1;
			} else {
				sum = sum + (arr[i] * K);
				count = count - K;
			}
		}

		System.out.println(sum);

	}

}
