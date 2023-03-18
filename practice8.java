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
		// 방법이 생각나지 않아서요..!
		// 혹시 다른 방법도 있을까요ㅠㅠ?
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
