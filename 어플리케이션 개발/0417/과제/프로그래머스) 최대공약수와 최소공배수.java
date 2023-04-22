import java.util.Arrays;

public class Class6 {

	public static void main(String[] args) {

		int n = 3;
		int m = 12;

		int[] answer = { 0, 0 };

		int len = 0;
		if (n > m)
			len = n + 1;
		else
			len = m + 1;

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
		

		// 최대공약수 구하기

		int[] arr3 = new int[len];

		for (int i = 0; i < len; i++) {
			if (arr1[i] != 0 && arr2[i] != 0) {
				arr3[i] = i;
			}
		}
		
		int max = 0;

		for (int i = 0; i < len; i++) {
			for (int j = 1; j < len; j++) {
				if (arr3[i] < arr3[j]) {
					max = arr3[j];
				}
			}
		}
		
		int min = 0;
		
		min = (n * m) / max;
		

		answer[0] = max;
		answer[1] = min;

		System.out.println(Arrays.toString(answer));

	}

}

//class Solution {
//    int[] solution(int n, int m) {
//        
//    int[] answer = { 0, 0 };
//		
//		int len = 0;
//		if (n > m)
//			len = n + 1;
//		else
//			len = m + 1;
//
//		int[] arr1 = new int[len];
//		int[] arr2 = new int[len];
//
//		for (int i = 1; i <= n; i++) {
//			if (n % i == 0) {
//				arr1[i] = i;
//			}
//		}
//
//		for (int i = 1; i <= m; i++) {
//			if (m % i == 0) {
//				arr2[i] = i;
//			}
//		}
//
//		// 최대공약수 구하기
//
//		int[] arr3 = new int[len];
//
//		for (int i = 0; i < len; i++) {
//			if (arr1[i] != 0 && arr2[i] != 0) {
//				arr3[i] = i;
//			}
//		}
//
//		int max = 0;
//
//		for (int i = 0; i < len; i++) {
//			for (int j = 1; j < len; j++) {
//				if (arr3[i] < arr3[j]) {
//					max = arr3[j];
//				}
//			}
//		}
//
//		// 최소공배수 구하기
//
//		int min = 0;
//
//		min = (n * m) / max;
//
//		answer[0] = max;
//		answer[1] = min;
//		
//		return answer;
//
//	}
//
//}


