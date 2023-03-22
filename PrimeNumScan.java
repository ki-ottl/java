import java.util.Scanner;

public class PrimeNumScan {

	public static void main(String[] args) {
		
		// 사용자로부터 출력받은 숫자가 소수인지 판단하여 출력하는 프로그램
		
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		int inputNum = Integer.parseInt(input);
		
		System.out.println("입력하신 숫자는 "+inputNum+"입니다.");
		
		boolean isPrime = true;
		
		for (int i = 0 ; i < inputNum ; i++) {

			if(i<2) { // 0으로는 나눌 수 없고 1로는 다 나누어지기 때문에 pass의 의미로 continue
				continue;
			}
			
			if(inputNum%i==0) {
				isPrime = false;
				break; // 반복문에서 빠져나온다.
			}
		}
		
		if(isPrime) {
			System.out.println("소수입니다.");
		} else {
			System.out.println("소수가 아닙니다.");
		}
		

	}

}
