
public class PrimeNum100 {

	public static void main(String[] args) {
		
		
		// 100까지의 소수를 출력 

		for (int i = 2 ; i < 101 ; i++) {
			
			boolean isPrime = true;

			for (int j = 0 ; j < i ; j++) {
				
				if (j<2) { // 0으로는 나눌 수 없고, 1로는 모든 것이 나누어지기 때문에 처리
					continue;
				}
				
				if (i % j==0) { 
					isPrime = false;
					break; 
				}
			
			}
			
			if (isPrime) {
				System.out.println(i);
			}
		
	
		}
		
	}
}

