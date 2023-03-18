import java.util.Random;
import java.util.Scanner;

public class practice5 {

	public static void main(String[] args) {
		
		System.out.println("랜덤숫자놀이게임");
		System.out.println("0~100사이의 숫자를 입력해주세요");
		System.out.println("입력 :");
	
		Scanner s= new Scanner(System.in);
		int inputNum = s.nextInt();
		
		Random r = new Random();
		int randomNum = r.nextInt(100);
		
		// 규칙2는 도저히 모르겠어서 재시도 메시지로 대체하였습니다ㅠㅠ
		if (randomNum == inputNum) {
			System.out.println("다시 시도해주세요");
		} else {
			if (0>inputNum||inputNum>100) {
				System.out.println("0~100사이의 숫자가 아닙니다");
			} else {
			System.out.println("사용자 입력숫자는 "+inputNum+"사용자입력숫자+랜덤숫자는"+(inputNum+randomNum)+", 컴퓨터 승리입니다");
			}

	}

}
}


//5. 랜덤숫자놀이게임을 만들어봅시다. 규칙은 다음과 같습니다.
//규칙1) 사용자로부터 입력받은 숫자에 임의의 숫자 값을 추가시킨다.
//규칙2) 컴퓨터는 임의의 숫자를 발생시키고, 해당 숫자에 임의의 사용자에게 추가한 임의의 값과 다른 임의의값을 추가시킨다.
//규칙3) 사용자가 0~100 을 제외한 숫자를 입력할 경우 "0~100사이의 숫자가 아닙니다." 메세지를 출력한다.




