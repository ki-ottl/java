import java.util.Scanner;

public class practice4 {

	public static void main(String[] args) {
		
		System.out.println("숫자입력:");
		
		Scanner s= new Scanner(System.in);
		
		int inputNum = s.nextInt();
		
		if (inputNum<21) {
			for (int i=inputNum ; i <= 20 ; i++) {
				System.out.println(7+" X "+i+" = "+7*i);
				}
		} else { 
			System.out.println("ERROR");
			}

	}

}

//4. <심화문제> 사용자로부터 입력받은 숫자부터 20까지 곱하는 구구단 7단을 작성해주세요.
//조건1> 사용자로부터 입력받은 숫자가 21이상이면 "ERROR"라고 표시한다.
//결과)
