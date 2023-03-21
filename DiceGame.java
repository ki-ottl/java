import java.util.Random;
import java.util.Scanner;

public class DiceGame {

	public static void main(String[] args) {
		
		for (int i = 0 ; i < 999 ; i++) {

			Scanner scanner = new Scanner(System.in);
			Random random = new Random(); // 일 시킬 애를 만들어 준다.
			
			System.out.println((i + 1) + "번째 게임");
			System.out.println("게임을 진행하실려면 엔터, 종료하실려면 q를 입력해주세요.");
			System.out.println("주사위를 굴릴까요?");

			String userInput = scanner.nextLine(); // 사용자 입력을 기다리게 된다.
			
			if (userInput.equals("q")) {
				break;
			}

			int userNum = (random.nextInt(6) + 1);
			System.out.println("당신의 주사위 숫자 : "+userNum);

			System.out.println("컴퓨터가 주사위를 굴립니다. 실행할까요?");

			scanner.nextLine();

			int computerNum = (random.nextInt(6) + 1);
			System.out.println("컴퓨터의 주사위 숫자 : " + computerNum);

			if (userNum > computerNum) {
				System.out.println("You Win!");
			} else if (userNum == computerNum) {
				System.out.println("Draw");
			} else {
				System.out.println("You Lose!");
			}
			
			System.out.println("---------------------");

		}
		
	}

}
