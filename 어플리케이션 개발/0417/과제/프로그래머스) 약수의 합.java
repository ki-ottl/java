public class Class4 {
	
    public static void main(String[] args) {
        System.out.println(solution(5));
    }
    
	public static int solution(int n) {

		int answer = 0;

		for (int i = 1; i < n + 1; i++) {
			if (n % i == 0) {
				answer = answer + i;
			}
		}

		return answer;
	}
}
    
