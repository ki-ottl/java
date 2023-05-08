import java.util.Arrays;
import java.util.Scanner;

public class Quiz2 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		String t = s.nextLine();
		int test = Integer.parseInt(t);

		for (int i = 0; i < test; i++) {

			String input = s.nextLine();
			char[] arrCh = input.toCharArray();

			int count = 0;

			for (int j = 0; j < arrCh.length; j++) {
				if ((arrCh[j]) == 'A') {
					count++;
				}
			}
			System.out.println(count);

		}
	}

}
