import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Class2 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());

		int n = scanner.nextInt();

		for (int i = 0; i < n; i++) {
			int num = scanner.nextInt();
			if (num == 0) {
				if (!maxHeap.isEmpty()) {
					System.out.println(maxHeap.poll());
				} else {
					System.out.println(0);
				}
			} else {
				maxHeap.add(num);
			}
		}

	}

}
