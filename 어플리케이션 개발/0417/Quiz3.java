import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class D0417Q3 {

	public static void main(String[] args) {

//		정수가 담긴 배열과 정수가 파라미터로 주어질 때, 해당 배열에 전달받은 정수n을 제외하고
//		중복을 제거한 숫자의 종류가 몇 개 있는 지를 return 하도록 아래 함수를 완성해보세요.
//
//				class Solution {
//				    public int solution(int[] array, int n) {
//				        int answer = 0;
//				        return answer;
//				    }
//				}
//
//				입력예시 : [1, 1, 2, 3, 4, 5], 1
//				출력예시 : 4
//
//				입력예시 : [1, 1, 2, 2, 4, 4], 1
//				출력예시 : 2

//	}

		int[] arr = { 1, 1, 2, 2, 4, 4 };
		int n = 1;

		System.out.println(solution(arr, n));

	}

	public static int solution(int[] array, int n) {

		Arrays.sort(array);

		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] == array[j]) {
					array[i] = -1;
				}
			}
		}

		int answer = 0;

		for (int i = 0; i < array.length; i++) {
			if (array[i] != n && -1 < array[i]) {
				answer++;
			}
		}

		return answer;
	}

}

// 참고

class Solution {
	public int solution(int[] array, int n) {
		Set<Integer> set = new HashSet<>();
		for (int num : array) {
			if (num != n) {
				set.add(num);
			}
		}
		return set.size();
	}
}