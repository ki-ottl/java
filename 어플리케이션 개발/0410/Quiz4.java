import java.util.Arrays;

public class Quiz4 {
	
//	4. 정수가 담긴 배열과 정수가 파라미터로 주어질 때, 
//	해당 배열에 전달받은 정수가 몇 개 있는 지를 return 하도록 아래 함수를 완성해보세요.
//
//			class Solution {
//			    public int solution(int[] array, int n) {
//			        int answer = 0;
//			        return answer;
//			    }
//			}
//
//			입력예시 : [1, 1, 2, 3, 4, 5], 1
//			출력예시 : 2

	public static void main(String[] args) {

		int num[] = { 1, 1, 2, 3, 4, 5 };
		int inputNum = 1;

		int answer = 0;

		for (int i = 0; i < num.length; i++) {
			if (num[i] == inputNum) {
				answer++;
			}
		}
		
		System.out.println(answer);
	
	}
}
