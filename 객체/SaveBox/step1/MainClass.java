import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		
		// 저금통 프로그램
		// 1. 메뉴를 이용해서 (1,2,3번 저금통에 입금, 종료 시 q) 입금, 출금까지 처리
		// 2. 입금할 때 땡그랑 소리 내고, 현재 보유금액 표시
		// 3. 출금할 때 전체 금액 출금
		// 4. 현재 출금을 해도 입금이 계속 됨. 이에 대한 대응처리. (출금 후 입금을 못하게 막는 등)

		SaveBox s1 = new SaveBox();
		SaveBox s2 = new SaveBox(); 
		SaveBox s3 = new SaveBox(); 

		s1.setName("1번");
		s2.setName("2번");
		s3.setName("3번");

		Scanner scanner = new Scanner(System.in);
		
		for (int i = 0; i < 999; i++) {

			System.out.println("원하시는 메뉴를 선택해주세요.");
			System.out.println("1. 1번 저금통 입금");
			System.out.println("2. 2번 저금통 입금");
			System.out.println("3. 3번 저금통 입금");
			System.out.println("4. 1번 저금통 출금");
			System.out.println("5. 2번 저금통 출금");
			System.out.println("6. 3번 저금통 출금");
			System.out.println("q. 종료");
			
			String inputMenu = scanner.nextLine();

			if (inputMenu.equals("1")) {
				s1.deposit();
			} else if (inputMenu.equals("2")) {
				s2.deposit();
			} else if (inputMenu.equals("3")) {
				s3.deposit();
			} else if (inputMenu.equals("4")) {
				s1.withdraw();
			} else if (inputMenu.equals("5")) {
				s2.withdraw();
			} else if (inputMenu.equals("6")) {
				s3.withdraw();
			} else if (inputMenu.equals("q")) {
				System.out.println("종료입니다.");
				break;
			} else {
				System.out.println("숫자를 다시 입력해주세요.");
			}
		}
	}
}