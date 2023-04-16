import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		
		SaveBox[] saveBoxArr = new SaveBox[100]; 
		
		
		for(int i = 0; i<saveBoxArr.length ; i++) {
			saveBoxArr[i] = new SaveBox();
		} 
		
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; ; i++) {
			
			System.out.println("원하시는 메뉴를 선택해주세요.");
			System.out.println("0. 저금통 생성");
			System.out.println("1. 저금통 입금");
			System.out.println("2. 저금통 출금");
			System.out.println("3. 잔액 확인");
			System.out.println("q. 종료");

			String step1 = scanner.nextLine();

			if (step1.equals("q")) {
				break;
			} else if (step1.equals("0")) {
				if (saveBoxArr[i].create()) {
					System.out.println("원하시는 메뉴를 선택해주세요.");
					System.out.println("1.입금 / 2.출금 / 3. 잔액확인 / q.종료");
					String step2 = scanner.nextLine();
					if (step2.equals("q")) {
						break;
					} else if (step2.equals("1")) {
						int step2Num = Integer.parseInt(step2); 
						saveBoxArr[step2Num].deposit();
					} else if (step2.equals("2")) {
						int step2Num = Integer.parseInt(step2);
							saveBoxArr[step2Num].withdraw();
					} else if (step2.equals("3")) {
						int step2Num = Integer.parseInt(step2);
						saveBoxArr[step2Num].balance();	
					}
				}
				
			} else if (step1.equals("1")) {
				System.out.println("입금을 원하는 저금통의 번호를 입력하세요");		
				String step2 = scanner.nextLine();
				int step2Num = Integer.parseInt(step2);
				saveBoxArr[step2Num].deposit();
			} else if (step1.equals("2")) {
				System.out.println("출금을 원하는 저금통의 번호를 입력하세요");
				String step2 = scanner.nextLine();
				int step2Num = Integer.parseInt(step2);
				saveBoxArr[step2Num].withdraw();
			} else if (step1.equals("3")) {
				System.out.println("잔액 확인을 원하는 저금통의 번호를 입력하세요");
				String step2 = scanner.nextLine();
				int step2Num = Integer.parseInt(step2);
					saveBoxArr[step2Num].balance();
			} else {
				System.out.println("입력이 잘못되었습니다.");
			}
		}
	}
}