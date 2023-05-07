import java.util.Arrays;

public class D0417W4 {

	public static void main(String[] args) {

		int n = 3;
		int m = 12;

		int[] answer = { 0, 0 };

		int len = Math.max(n, m) + 1;

		int[] arr1 = new int[len];
		int[] arr2 = new int[len];

		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				arr1[i] = i;
			}
		}

		for (int i = 1; i <= m; i++) {
			if (m % i == 0) {
				arr2[i] = i;
			}
		}

		// �ִ����� ���ϱ�

		int[] arr3 = new int[len];

		for (int i = 1; i < len; i++) {
			if (arr1[i] != 0 && arr2[i] != 0) {
				arr3[i] = i;
			}
		}

		int max = 0;

		for (int i = 1; i < len; i++) {
			if (arr3[i] != 0 && arr3[i] > max) {
				max = arr3[i];
			}
		}

		int min = n * m / max;

		answer[0] = max;
		answer[1] = min;

		System.out.println(Arrays.toString(answer));

	}

}