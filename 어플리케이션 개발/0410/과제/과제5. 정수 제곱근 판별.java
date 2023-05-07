
public class Quiz4 {

	public static void main(String[] args) {
		
//		임의의 양의 정수 n에 대해, n이 어떤 양의 정수 x의 제곱인지 아닌지 판단하려 합니다.
//		n이 양의 정수 x의 제곱이라면 x+1의 제곱을 리턴하고, n이 양의 정수 x의 제곱이 아니라면 -1을 리턴하는 함수를 완성하세요.
		
		int inputN = 121; // 11의 제곱이니까 12의 제곱인 144를 리턴해야 함!
		
		double inputNum = Math.sqrt(inputN);
		
		System.out.println(inputNum);
		System.out.println(inputN);

		int answer = 0;

		if (Math.floor(inputNum) * Math.floor(inputNum) == Math.floor(inputN)) {
			answer = (int) Math.pow(inputNum + 1, 2);
		} else {
			answer = -1;
		}

		System.out.println(answer);
		
// 참고	
//		class Solution {
//		    public long solution(long n) {
//		        long answer = -1;
//		        double root = Math.sqrt(n); // n의 제곱근을 계산
//		        if(root == (int)root) { // n의 제곱근이 정수인지 확인
//		            answer = (long)Math.pow(root + 1, 2); // 정수면 (루트 n + 1)을 제곱한 값을 리턴
//		        }
//		        return answer;
//		    }
//		}
//		
		
		
	}

}
