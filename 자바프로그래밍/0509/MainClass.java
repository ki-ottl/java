import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {

		// 1. 메뉴 만들어서 작업
		// 2. 객체 데이터 반드시 사용
		// 3. 10명의 성적 데이터 입력해서 출력 (입력, 출력 메뉴)
		// 이름, 성적
		// (+) 성적순 출력

		Manager manager = new Manager();
		Scanner scanner = new Scanner(System.in);
		
		for (int i = 0; i < 9999; i++) {
			System.out.println("---------원하시는 메뉴를 선택해주세요.---------");
			System.out.println("1. 학생 이름 및 성적 입력");
			System.out.println("2. 성적순 학생 출력");

			String inputMenu = scanner.nextLine();
			if (inputMenu.equals("q")) {
				break;
			} else if (inputMenu.equals("1")) {
				// 학생 정보 입력
				System.out.println("10명의 학생의 이름과 성적을 입력하세요.");
				manager.inputStudents();
			} else if (inputMenu.equals("2")) {
				manager.printStudents();
			}
		}
	}
}