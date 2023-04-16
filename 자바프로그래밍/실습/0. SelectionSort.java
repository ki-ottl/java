import java.util.Arrays;
import java.util.Random;

public class SelectionSort {

	public static void main(String[] args) {

		// sort (selection sort)

		int[] numbers = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		
		Random random = new Random(); 
		for (int i = 0; i < numbers.length; i++) { 
			numbers[i] = random.nextInt(100) + 1; 
		}

		int tmp;

		for (int i = 0; i < numbers.length-1; i++) {
			for (int j = i + 1; j < numbers.length; j++) {
				if (numbers[i] > numbers[j]) {
					tmp = numbers[i];
					numbers[i] = numbers[j];
					numbers[j] = tmp;
				}
			}
		} // Arrays.sort(numbers);

		System.out.println(Arrays.toString(numbers));
		
	}

}
