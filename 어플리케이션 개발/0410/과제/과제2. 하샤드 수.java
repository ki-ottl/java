import java.util.Arrays;
import java.util.Scanner;

class Quiz2 {

	public static void main(String[] arg) {

//		하샤드의 수		
//		양의 정수 x가 하샤드 수이려면 x의 자릿수의 합으로 x가 나누어져야 합니다. 
//		예를 들어 18의 자릿수 합은 1+8=9이고, 18은 9로 나누어 떨어지므로 18은 하샤드 수입니다. 
//		자연수 x를 입력받아 x가 하샤드 수인지 아닌지 검사하는 함수, solution을 완성해주세요.
		
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		int inputNum = Integer.parseInt(input);
		boolean answer = false;
		
		String inputN = inputNum + ""; // 숫자를 문자로 변환
		
		String[] inputStr = inputN.split("");
		
		int sum = 0;
		
		for(int i = 0; i < inputStr.length ; i++) {
			sum = sum + Integer.parseInt(inputStr[i]); // 문자를 숫자로 변환
		}
		
		if (inputNum%sum==0) {
			answer = true;
		} 
		
		System.out.println("입력한 숫자 "+inputNum+"의 하샤드의 수 여부 : "+answer);

}

	
//제출 답안
//class Solution {
//	public boolean solution(int x) {
//		boolean answer = false;
//		String inputN = x + "";
//		String[] inputStr = inputN.split("");
//
//		int sum = 0;
//		for (int i = 0; i < inputStr.length; i++) {
//			sum = sum + Integer.parseInt(inputStr[i]);
//		}
//
//		if (x % sum == 0) {
//			answer = true;
//		}
//
//		return answer;
//	}
//}
	
}





	
	

