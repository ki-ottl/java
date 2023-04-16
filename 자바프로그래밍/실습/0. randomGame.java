import java.util.Random;
import java.util.Scanner;

public class GameHomeWork {

	public static void main(String[] args) {
		
		// score
		int win = 0;
		int tie = 0;
		int lose = 0;

		
		for (int i = 0 ; i < 9999 ; i++) {
			System.out.println("-------------------------------------------"); // 구분선
			System.out.println("입력해 주세요. (가위 : 0, 바위: 1, 보: 2, 종료:q)");
			Scanner s = new Scanner(System.in); 
			String inputStr = s.nextLine(); // 입력값 저장
			
			if (inputStr.equals("q")) {
				System.out.println("종료되었습니다.");
				break;
			} // 예외처리
			
			int inputNum = Integer.parseInt(inputStr);
 
			Random r = new Random();
			int outputNum = r.nextInt(3);

			if (inputNum < 0 || inputNum > 2) {
				System.out.println("0 ~ 2의 값을 입력해주세요.");
				return;
			} else {
				System.out.println("컴퓨터가 낸 값 : " + outputNum);
			}

			
			if ((inputNum == 0 && outputNum == 2) || (inputNum == 1 && outputNum == 0)||(inputNum == 2 && outputNum == 1) ) {
				win = win + 1;
			} else if (inputNum == outputNum) {
				tie = tie + 1;
			} else {
				lose = lose + 1;
			}
			
			
			if (inputNum == outputNum) {
				System.out.println("비겼습니다.");
				System.out.println("현재 사용자 스코어는 [승리 : "+ win + ", 무승부 : " + tie + ", 패배 : " + lose + "] 입니다.");
				
			} else if ((inputNum == 0 && outputNum == 2) || (inputNum == 1 && outputNum == 0)||(inputNum == 2 && outputNum == 1)) {
				System.out.println("이겼습니다.");
				System.out.println("현재 사용자 스코어는 [승리 : "+ win + ", 무승부 : " + tie + ", 패배 : " + lose + "] 입니다.");
			} else {
				System.out.println("졌습니다.");
				System.out.println("현재 사용자 스코어는 [승리 : "+ win + ", 무승부 : " + tie + ", 패배 : " + lose + "] 입니다.");
			} 			

		}
		
	}
	
}
