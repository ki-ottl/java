
public class sumNumber {

	public static void main(String[] args) {
	
		
		// 실습 #1. 1부터 1000까지 합 출력
		
		int sum = 0;
		
		for (int i = 0 ; i <= 1000; i++) {
			sum = sum + i;
		}
		System.out.println(sum);
		
		// 실습 #2-1 1부터 100까지 짝수 합 출력
		// 증감식 부분 += 이용하기
		
		int sumEvenNumber = 0;
		
		for (int j = 0 ; j <= 100 ; j+=2) {
			sumEvenNumber = sumEvenNumber + j ;
		}
		System.out.println(sumEvenNumber);
		
		// 실습 #2-2 1부터 100까지 짝수 합 출력
		// 합 구하고 짝수만 뽑아내는 방식으로
		
		int sumEvenNumber2 = 0;
		
		for (int k = 1; k <= 100 ; k++ ) {
			if (k%2==0) {
			sumEvenNumber2 = sumEvenNumber2 + k ;
		} 
	}	
		System.out.println(sumEvenNumber2);
		
		// 교수님 답안 ) 1. 1부터 1000까지 합 출력
		
		int sum2 = 0;
		for (int i = 0 ; i <1000 ; i++ ) {
			sum2 = sum2 + (i+1);
		}
		System.out.println("합계 : "+sum2);
		
		// 교수님 답안 )  2. 1부터 100까지 짝수 합 출력
		int sum3 = 0;
		for (int i = 0 ; i < 100 ; i++) {
			if ((i+1) % 2==0) {
				sum3 = sum3 +(i+1);
			}
		} 
		System.out.println("짝수 합 : "+sum3);
		
		
	}
}






