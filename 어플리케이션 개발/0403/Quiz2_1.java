import java.util.Arrays;
import java.util.Scanner;

public class Quiz2_1 {

	public static void main(String[] args) {

		// 아래의 입출력 예시를 참조하여 수열에서 중복된 숫자를 제거하고
		// 오름차순으로 출력하는 프로그램을 작성하시오
		// (숫자의 범위는 0 이상 10 이하의 자연수)

		// 입력
		// 3
		// 10 1 3 3 4 5 2 6 7 6 7
		// 7 1 3 3 1 1 2 2
		// 7 1 5 1 3 9 0 8

		// 출력
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
			cnt = new int[11]; // 숫자의 범위가 0~10이기 때문에 11개의 공간 생성

			for (int i = 0; i < N; i++) {
				arr[i] = scanner.nextInt();
				cnt[arr[i]]++;
			}

//			System.out.println(Arrays.toString(arr));
//			System.out.println(Arrays.toString(cnt));

			for (int i = 0; i < 11; i++) {
				if (cnt[i] > 0) { // 중복값이 있다면 0 이상
					System.out.print(i);
				}

//				중복 제거 없이 오름차순 출력
//				if (cnt[i] > 0) {
//					for (int j = 0 ; j < cnt[i] ; j++) {
//						System.out.print(i);
//					}
//				}

			}

		}

	}

}
