import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Quiz4 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int testCase = s.nextInt();

		int[] arr = new int[10];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = s.nextInt();
		}

		Arrays.sort(arr);

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();

		int[] arr2 = new int[5];
		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = s.nextInt();
		}

		Arrays.sort(arr2);

		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + " ");
		}
		System.out.println();

		int[] arr3 = new int[3];
		for (int i = 0; i < arr3.length; i++) {
			arr3[i] = s.nextInt();
		}

		Arrays.sort(arr3);

		for (int i = 0; i < arr3.length; i++) {
			System.out.print(arr3[i] + " ");
		}
		System.out.println();

		int[] arr4 = new int[5];
		for (int i = 0; i < arr4.length; i++) {
			arr4[i] = s.nextInt();
		}

		Arrays.sort(arr4);

		for (int i = 0; i < arr4.length; i++) {
			System.out.print(arr4[i] + " ");
		}
		System.out.println();

		int[] arr5 = new int[5];
		for (int i = 0; i < arr5.length; i++) {
			arr5[i] = s.nextInt();
		}

		Arrays.sort(arr5);

		for (int i = 0; i < arr5.length; i++) {
			System.out.print(arr5[i] + " ");
		}
		System.out.println();

	}

}
