import java.util.Arrays;
import java.util.Scanner;

public class Quiz2_1 {

	public static void main(String[] args) {

		// �Ʒ��� ����� ���ø� �����Ͽ� �������� �ߺ��� ���ڸ� �����ϰ�
		// ������������ ����ϴ� ���α׷��� �ۼ��Ͻÿ�
		// (������ ������ 0 �̻� 10 ������ �ڿ���)

		// �Է�
		// 3
		// 10 1 3 3 4 5 2 6 7 6 7
		// 7 1 3 3 1 1 2 2
		// 7 1 5 1 3 9 0 8

		// ���
		// 1234567
		// 123
		// 013589

		Scanner scanner = new Scanner(System.in);

		int T = scanner.nextInt();
		int N;
		int[] arr;
		int[] cnt;

		for (int test_case = 1; test_case <= T; test_case++) {
			N = scanner.nextInt();
			arr = new int[N];
			cnt = new int[11]; // ������ ������ 0~10�̱� ������ 11���� ���� ����

			for (int i = 0; i < N; i++) {
				arr[i] = scanner.nextInt();
				cnt[arr[i]]++;
			}

//			System.out.println(Arrays.toString(arr));
//			System.out.println(Arrays.toString(cnt));

			for (int i = 0; i < 11; i++) {
				if (cnt[i] > 0) { // �ߺ����� �ִٸ� 0 �̻�
					System.out.print(i);
				}

//				�ߺ� ���� ���� �������� ���
//				if (cnt[i] > 0) {
//					for (int j = 0 ; j < cnt[i] ; j++) {
//						System.out.print(i);
//					}
//				}

			}

		}

	}

}
