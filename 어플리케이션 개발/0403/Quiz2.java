import java.util.Arrays;
import java.util.Scanner;

public class Quiz2 {

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

		for (int test_case = 1; test_case <= T; test_case++) {
			N = scanner.nextInt();
			arr = new int[N];

			for (int i = 0; i < N; i++) {
				arr[i] = scanner.nextInt();
			}

			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < i; j++) {
					if (arr[i] == arr[j]) {
						arr[i] = Integer.MIN_VALUE; // �ߺ����� �ּҰ� ó��
					}
				}
			}

			Arrays.sort(arr); // �������� ����

			for (int i = 0; i < arr.length; i++) {
				if (arr[i] != Integer.MIN_VALUE) {
					System.out.print(arr[i]);
				}
			}
			
			System.out.println();

		}

	}

}
