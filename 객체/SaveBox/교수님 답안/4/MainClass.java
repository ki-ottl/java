import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		SaveBox[] saveBox = new SaveBox[100];
		int saveBoxCount = 0;

		for (int i = 0; i < 99999; i++) {
			// 저금통 현재 목록 조회 (출력)
			System.out.println();
			System.out.println();
			System.out.println("---------------------- 현재 저금통 목록 --------------------------");
			for (int j = 0; j < saveBoxCount; j++) {
				System.out.print(j + " : ");
//				saveBox[j].info();
//				System.out.print(saveBox[j].name + " (잔액 : " + saveBox[j].coin + ")");
				System.out.println(saveBox[j]);
//				System.out.println(saveBox[j].toString()); // 위 아래 동일
			}
			System.out.println();
			System.out.println("---------------------- 원하시는 메뉴를 선택해주세요. --------------------------");
			System.out.println("1. 저금통 생성");
			System.out.println("2. 저금통 액션 (입금, 출금)");
			System.out.println("q. 종료");
			
			Scanner scanner = new Scanner(System.in);
			String menuSelect = scanner.nextLine();
			if (menuSelect.equals("q")) {
				break;
			} else if (menuSelect.equals("1")) {
				// 저금통 생성
				if (saveBoxCount < saveBox.length) {
					saveBox[saveBoxCount] = new SaveBox();
					saveBoxCount++;
				} else {
					System.out.println("저금통 생성 개수를 초과했습니다. 최대 만들 수 있는 저금통 갯수는 " + saveBox.length + "입니다.");
				}
			} else if (menuSelect.equals("2")) {
				// 저금통 액션 (입금, 출금)
				System.out.println("현재 " + saveBoxCount + "의 저금통이 있습니다. 0부터 " + (saveBoxCount - 1) + "의 숫자 입력");
				System.out.println("액션을 원하는 저금통의 숫자(INDEX)를 입력해주세요.");
				String saveBoxSelect = scanner.nextLine();
				// 숫자인지(정확히는 정수인지) 검사해서 종료 (이번 수업에선 들어가지 않음.)
				int selectNumber = Integer.parseInt(saveBoxSelect);
				if (selectNumber < 0 || selectNumber >= saveBoxCount) {
					System.out.println("입력된 값이 잘못 되었습니다.");
					continue;
				}
				saveBox[selectNumber].doAction();
			} else {
				System.out.println("입력이 잘못되었습니다. 다시 입력해주세요.");
			}
		}
		
	}
}
