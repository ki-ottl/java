import java.io.FileInputStream;
import java.util.Arrays;
import java.util.Scanner;

public class Quiz1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

//		첫째 줄에 수의 개수 N(1 ≤ N ≤ 1,000)이 주어진다. 
//		둘째 줄부터 N개의 줄에는 수가 주어진다. 
//		이 수는 절댓값이 1,000보다 작거나 같은 정수이다. 
//		수는 중복되지 않는다.
		
//		입력값 
//		5
//		5
//		2
//		3
//		4
//		1
//		
//		출력값
//		1
//		2
//		3
//		4
//		5
		
		int num = sc.nextInt();
		
		int[] arr = new int[num];
		
		for (int i = 0 ; i < arr.length ; i++) {
			arr[i] = sc.nextInt();
		}
		
		for (int i = 0 ; i < arr.length ; i++) {
			for (int j = i+1 ; j<arr.length ; j++) {
				if (arr[i]>arr[j]) {
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		
		for (int i = 0 ; i < arr.length ; i++) {
			System.out.println(arr[i]);
		}
	}
}

