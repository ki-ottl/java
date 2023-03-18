import java.util.Scanner;

public class practice9 {

	public static void main(String[] args) {
		
		
		System.out.println("숫자를 입력해주세요 :");
		
		Scanner s= new Scanner(System.in);
		int userNum = s.nextInt();

		for (int i = 0 ; i < 9 ; i++) {
			System.out.println("입력하신 숫자 "+userNum+"를 3으로 나눈 값은 "+(userNum-=3)+" 입니다");
		}

	}
}

//9. <심화> 다음의 문제를 보고 아래의 결과를 출력하기 위해서 빈칸에 들어갈 코드를 차례대로 입력해주세요.

// 최대한 고민해보았는데 출력값이 달라서 답을 찾지 못했다.
// 첫 번째 빈 칸 : int i = 0 ; i < 9 ; i++
// 두 번째 빈 칸: userNum
// 세 번째 빈 칸 : userNum-=3
