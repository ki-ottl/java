import java.util.Arrays;

public class Quiz6 {

	public static void main(String[] args) {

		int[] arr = { 1, 1, 2, 3, 4, 6 };
		int[] arr2 = { 6, 1, 2, 3, 4, 3 };

		Arrays.sort(arr);
		Arrays.sort(arr2);

		boolean isAvaliable = true;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != arr2[i]) {
				isAvaliable = false;
			} else {
				isAvaliable = true;
			}
		}

		if (isAvaliable) {
			System.out.println("T");
		} else {
			System.out.println("F");
		}
	}
}
