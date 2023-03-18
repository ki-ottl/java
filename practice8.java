import java.util.Random;
import java.util.Scanner;

public class practice8 {

	public static void main(String[] args) {


		System.out.println("숫자를 입력해주세요(0~100) :");
	
		Scanner s= new Scanner(System.in);
		int inputNum = s.nextInt();
		
		Random r = new Random();
		int randomNum = r.nextInt(10);
		
		// 분모가 0인 경우를 예외처리하고 싶은데
		// 
		if (randomNum==0) {
			System.out.println("다시 시도해주세요");
		}
		
		int divideNum = inputNum / randomNum;

		if (0>inputNum||inputNum>100) {
				System.out.println("숫자가 큽니다");
			} else {
				if (divideNum%2==1) {
					System.out.println("당신의 숫자 "+inputNum+"에서 임의의 값 "+randomNum+"을 나눈 값은"+divideNum+"이고, 해당 숫자는 홀수 입니다.");
				}
				else {
					System.out.println("당신의 숫자 "+inputNum+"에서 임의의 값 "+randomNum+"을 나눈 값은"+divideNum+"이고, 해당 숫자는 짝수 입니다.");
				}
			}

	}
}

//8. 사용자로부터 0~100 사이의 숫자를 입력 받습니다.
//입력받은 숫자에 1~10 까지의 임의의 값으로 나누어 줍니다.
//나눈 값이 짝수인지 홀수인지 출력을 해주세요.
//단, 사용자로부터 입력받은 숫자가 0보다 작거나 100보다 클때는 "숫자가 큽니다"를 출력하도록 작성해주세요


