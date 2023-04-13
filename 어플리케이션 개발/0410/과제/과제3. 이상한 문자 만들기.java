import java.util.Arrays;
import java.util.Scanner;

public class Quiz3 {

	public static void main(String[] args) {
		
//		문자열 s는 한 개 이상의 단어로 구성되어 있습니다. 
//		각 단어는 하나 이상의 공백문자로 구분되어 있습니다. 
//		각 단어의 짝수번째 알파벳은 대문자로,
//		홀수번째 알파벳은 소문자로 바꾼 문자열을 리턴하는 함수, solution을 완성하세요.
	
		
//		Scanner scanner = new Scanner(System.in);
//		String input = scanner.nextLine();
		
		String input = "try hello world";

		String[] inputStr = input.split("");
		
		System.out.println(Arrays.toString(inputStr));
		
		
		String output = "";
		
		for(int i = 0; i < inputStr.length ; i++) {
			
			if (inputStr[i]=="") {
				break;
			} else if (i%2==0) {
				inputStr[i]=inputStr[i].toUpperCase();
				output = output + inputStr[i];
			} else if (i%2!=0) {
				output = output + inputStr[i];
			}
		}
		
		System.out.println(output);
			
		// 제출용
		
//		class Solution {
//		    public String solution(String s) {
//
//				String input = s;
//				String[] inputStr = input.split("");
//				
//				String answer = "";
//				
//				for(int i = 0; i < inputStr.length ; i++) {	
//					if (inputStr[i]=="") {
//						break;
//					} else if (i%2==0) {
//						inputStr[i]=inputStr[i].toUpperCase();
//						answer = answer + inputStr[i];
//					} else if (i%2!=0) {
//						answer = answer + inputStr[i];
//					}
//				}
//
//		        return answer;
//		    }
//		}
		
		

	}

}
