import java.util.Scanner;

public class SaveBox {
	int coin = 0;
	boolean isBroken = false;
	
	// 입금
	public void deposit() {
		System.out.println("입금할 금액을 입력해주세요.");
		Scanner scanner = new Scanner(System.in);
		String inputCoinString = scanner.nextLine();
		int inputCoin = Integer.parseInt(inputCoinString);
		this.coin = this.coin + inputCoin;
		System.out.println("" + inputCoin + "이 입금되었습니다. 현재 총액 " + this.coin);
	}
	
	// 출금
	public void withdraw() {
		System.out.println("" + this.coin + "이 출금되었습니다.");
		this.isBroken = true;
	}
	
	public void doAction() {
		if (this.isBroken) {
			System.out.println("이 저금통은 더이상 사용할 수 없습니다.");
			return;
		}
		System.out.println("1. 입금, 2. 출금 중 선택해주세요.");
		Scanner scanner = new Scanner(System.in);
		String inputAction = scanner.nextLine();
		if (inputAction.equals("1")) {
			this.deposit();
		} else if (inputAction.equals("2")) {
			this.withdraw();
		} else {
			System.out.println("입력이 잘못되었습니다. 다시 입력해주세요.");
			this.doAction();
		}
	}
}
