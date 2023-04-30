import java.util.Arrays;

public class P0417Q4 {
	
	public static void main(String[] args) {

//		정수가 담긴 배열과 정수가 파라미터로 주어질 때, 해당 배열에 전달받은 정수 n(1<=n<=9)를 곱한 배열을 리턴하는 함수를 완성해보세요. 
//
//		class Solution {
//		    public int[] solution(int[] array, int n) {
//		        int[] answer = 0;
//		        return answer;
//		    }
//		}
//
//		입력예시 : [1, 1, 2, 3, 4, 5], 2
//		출력예시 : [2, 2, 4, 6, 8, 10]

		int[] arr = { 1, 1, 2, 3, 4, 5 };
		int inputNum = 2;

		System.out.println(Arrays.toString(solution(arr, inputNum)));

	}

	public static int[] solution(int[] array, int n) {

		int[] result = new int[array.length];

		for (int i = 0; i < array.length; i++) {

			result[i] = array[i] * n;

		}

		return result ;

	}

}