import java.util.Arrays;

public class Quiz3 {
	
//	3. 정수가 담긴 리스트 배열이 함수의 입력 파라미터로 전달된다. 
//	전달받은 배열의 원소 중 짝수와 홀수의 개수를 담은 배열을 return 하도록 함수를 완성하시오.
//
//			class Solution {
//			    public int[] solution(int[] num_list) {
//			        int[] answer = {};
//			        return answer;
//			    }
//			}
//
//			입력예시 [1,2,3,4,5]
//			출력예시 [2,3]

	public static void main(String[] args) {

		int num[] = { 1, 2, 3, 4, 5 };

		int even[] = new int[100];
		int odd[] = new int[100];

		for (int i = 0; i < num.length; i++) {

			if (num[i] % 2 == 0) {
				even[i] = num[i];
			} else {
				odd[i] = num[i];
			}

		}

		System.out.println("입력예시 "+Arrays.toString(num));

		int countEven = 0;
		int countOdd = 0;

		// 개수 파악

		for (int i = 0; i < even.length; i++) {

			if (even[i] != 0) {
				countEven++;
			}
		}

		for (int i = 0; i < even.length; i++) {

			if (odd[i] != 0) {
				countOdd++;
			}
		}

		int[] answer = { countEven, countOdd };

		System.out.println("출력예시 "+Arrays.toString(answer));

	}

}
