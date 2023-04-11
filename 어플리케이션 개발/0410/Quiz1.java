import java.util.Scanner;

public class Quiz1 {

	public static void main(String[] args) {

//		첫째 줄부터 다섯 번째 줄까지 한 줄에 하나씩 자연수가 주어질 때, 평균값과 중앙값을 출력하는 프로그램을 작성하시오.
//		1
//		2
//		3
//		4
//		5
//		출력예시>
//		3
//		3
		
// 		중앙값 : 오름차순으로 소팅한 후에 가장 가운데에 있는 값

		// step1. 평균값 구하기

		// 입력값을 저장

		int[] arr = new int[5];
		int[] inputNum = { 1, 2, 3, 4, 5 };

		for (int i = 0; i < 5; i++) {
			arr[i] = inputNum[i];
		}

		// 합

		int sum = 0;

		for (int i = 0; i < 5; i++) {
			sum += arr[i];
		}

		// 평균값 구하기

		double avg = sum / arr.length;
		System.out.println("평균값 : " + avg);

		// step2. 중앙값 구하기

		int tmp = 0;

		// 오름차순으로 소팅

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}

		System.out.println("중앙값 : " + arr[2]);

	}
}
