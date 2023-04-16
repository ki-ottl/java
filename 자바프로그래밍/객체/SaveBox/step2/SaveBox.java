import java.util.Scanner;

public class SaveBox {
	int coin = 0;
	boolean isBroken = false;
	boolean isCreate = false;

	public boolean create() {

		if (this.isBroken) {
			System.out.println("이 저금통은 더이상 사용할 수 없습니다.");
			return false;
		} else if (this.isCreate) {
			System.out.println("이미 생성된 저금통입니다.");
			return false;
		} else {
			System.out.println("저금통의 번호를 입력해주세요");
			Scanner scanner = new Scanner(System.in);
			String inputString = scanner.nextLine();
			System.out.println("저금통이 생성되었습니다.");
			this.isCreate = true;
		}
		return true;
	}

	public void deposit() {

		if (this.isCreate) {
			System.out.println("저금통이 존재하지 않습니다.");
			System.out.println("저금통을 생성하고 시도해주세요.");
			return;
		} else if (this.isBroken) {
			System.out.println("이 저금통은 더이상 사용할 수 없습니다.");
			return;
		} else {
			Scanner scanner = new Scanner(System.in);
			System.out.println("입금할 금액을 입력해주세요.");
			String inputString = scanner.nextLine();
			int inputCoin = Integer.parseInt(inputString);
			this.coin = this.coin + inputCoin;
			System.out.println("땡그랑");
			System.out.println("현재 보유 금액은 " + this.coin + "입니다.");
		}
	}
	
	public void withdraw() {
		
		if (this.isCreate==false) {
			System.out.println("저금통이 존재하지 않습니다.");
			System.out.println("저금통을 생성하고 시도해주세요.");
			return; 
		} else {			
			System.out.println("저금통을 깼습니다.");
			System.out.println("최종 출금 금액은 " + this.coin + "입니다.");
			this.isBroken = true;
		}
	}
	
	public void balance() {
		
		if (this.isCreate==false) {
			System.out.println("저금통이 존재하지 않습니다.");
			System.out.println("저금통을 생성하고 시도해주세요.");
			return;
		} else {
			System.out.println("현재 보유 금액은 " + this.coin + "입니다.");
		}
	}
	
}
