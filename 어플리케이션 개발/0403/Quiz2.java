import java.util.Arrays;
import java.util.Scanner;

public class Quiz2 {

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

		for (int test_case = 1; test_case <= T; test_case++) {
			N = scanner.nextInt();
			arr = new int[N];

			for (int i = 0; i < N; i++) {
				arr[i] = scanner.nextInt();
			}

			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < i; j++) {
					if (arr[i] == arr[j]) {
						arr[i] = Integer.MIN_VALUE; // 중복값은 최소값 처리
					}
				}
			}

			Arrays.sort(arr); // 오름차순 정렬

			for (int i = 0; i < arr.length; i++) {
				if (arr[i] != Integer.MIN_VALUE) {
					System.out.print(arr[i]);
				}
			}
			
			System.out.println();

		}

	}

}
