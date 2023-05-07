import java.util.Arrays;

public class D0417Q1 {
	
	public static void main(String[] args) {
	
//	아래 로직을 구현하는 함수를 작성하세요.
//	- 입력 : integer start, integer n
//	- 로직 : 입력받은 start 숫자부터 1씩 증가하는 총 n개의 배열을 구하고, 해당 배열의 값을 모두 더하여 리턴
//	- 출력 : 로직에서 구한 배열의 원소 합(integer)
//
//	예시> 
//	입력 : 2, 5
//	로직 : [2,3,4,5,6]
//	출력 : 20

		
		System.out.println(solution(2, 5));

	}


	public static int solution(int start, int n) {

		int[] arr = new int[n];
		
		for (int i = 0 ; i < arr.length ; i++) {
			arr[i] = start + i;
		}
		
		int answer = 0;
		
		for (int i = 0 ; i < arr.length ; i++) {
			answer = arr[i] + answer;
		}
		
		return answer;
	}

}

