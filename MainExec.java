import java.util.Scanner;

public class MainExec {
	
	public static void main(String[] args) {
		
		KaupsIndex kaupsIndex = new KaupsIndex();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("당신의 몸무게와 키를 입력해주세요");
		
		double weight = scanner.nextDouble();
		double height = scanner.nextDouble();

		kaupsIndex.index(weight, height);
		
	}
	
}



