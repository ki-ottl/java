import java.util.Scanner;

public class SaveBox {

	int coin = 0; // 프로퍼티 : 변수이름을 프로퍼티라고 부른다. 
	String name = "1번"; // 프로퍼티
	boolean isBroken = false;

	public void deposit() { // 메소드 : 입금
		if (this.isBroken) {
			System.out.println("이 저금통은 더이상 사용할 수 없습니다.");
			return;
		}
	
		Scanner scanner = new Scanner(System.in);
		System.out.println(this.name + "에 입금할 금액을 입력해주세요.");
		String inputString = scanner.nextLine();
		int inputCoin = Integer.parseInt(inputString);

		this.coin = this.coin + inputCoin; // this 내 프로퍼티에 접근하는거야. 라고 명확하게 표시.
		System.out.println("땡그랑");	
		System.out.println("현재 보유 금액은 "+ this.coin +"입니다.");
		// 프로퍼티 사용 시에는 무조건 this 기입하도록 습관화
	}

	public void withdraw() {
		System.out.println(this.name + " 저금통을 깼습니다.");
		System.out.println("최종 출금 금액은 " + coin + "입니다.");
		this.isBroken = true;
	}

	public void setName(String name) { // 같은 이름이지만 같은 이름 아니다! 
									  
		this.name = name; // 프로퍼티, 
		// this. 안쓰면 구분이 안된다! name = name;으로 쓰면 구분이 안됨!!
	}
	

}