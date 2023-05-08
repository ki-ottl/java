import java.util.Arrays;

public class Quiz5 {

	public static void main(String[] args) {

		int d = 5;
		int[] input = { 5, 9, 7, 11, 15};

		int[] output = new int[input.length];
		int count = 0;
		int outputNum = -1;

		for (int i = 0; i < input.length; i++) {
			if (input[i] % d == 0) {
				output[i] = input[i];
				count++;
			}
		}

		for (int i = 0; i < output.length; i++) {
			if (count == 0) {
				System.out.println(outputNum);
				break;
			} else {
				if (output[i] != 0) {
					System.out.println(output[i]);
				}
			}
		}

	}

}
