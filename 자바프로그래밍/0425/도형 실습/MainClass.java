import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		Base[] b = new Base[10];		
		Scanner scanner = new Scanner(System.in);
		
		for(int i = 0; i < 10 ; i++) {
			System.out.println(i+"번째 도형은 무엇으로 할까요?");
			System.out.println("1. 삼각형 / 2. 사각형 / 3.원");
			String inputString = scanner.nextLine();
			int inputNum = Integer.parseInt(inputString);
			
			if(inputNum==1) {
				b[i] = new Circle();
			} else if (inputNum==2) {
				b[i] = new Square();
			} else if (inputNum==3) {
				b[i] = new Triangle();
			}
		}
		
		System.out.println("============도형 목록 출력============");
		
		for (int i = 0 ; i < 10 ; i++) {
			System.out.print(i+"번째 도형 : ");
			b[i].doAction();
		}
		
	}
}
