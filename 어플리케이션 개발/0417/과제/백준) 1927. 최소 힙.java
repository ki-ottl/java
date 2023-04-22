import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Class1 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		PriorityQueue<Integer> minHeap = new PriorityQueue<>();

		int n = scanner.nextInt();

		for (int i = 0; i < n; i++) {
			int num = scanner.nextInt();
			if (num == 0) {
				if (!minHeap.isEmpty()) {
					System.out.println(minHeap.poll());
				} else {
					System.out.println(0);
				}
			} else {
				minHeap.add(num);
			}
		}

	}

}