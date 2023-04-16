
public class SumMachine {
	public int makeSum(int start, int end) {
		int total = 0;
		for (int i = start; i < end + 1; i++) {
			total = total + i;
		}
		
		return total;
	}
}
