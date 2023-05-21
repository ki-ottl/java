import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {

		// 1. 사용자로부터 데이터를 입력 받음 (메뉴 사용)
	  	//    데이터는 학생(성적) - 이름, 성적 2개 입력
		// 2.  가장 높은 점수를 얻은 학생 출력

		Manager manager = new Manager();
		Scanner scanner = new Scanner(System.in);
		
		for (int i = 0; i < 9999; i++) {
			System.out.println("---------원하시는 메뉴를 선택해주세요.---------");
			System.out.println("1. 학생 이름 및 성적 입력");
			System.out.println("2. 가장 높은 점수를 얻은 학생 출력");

			String inputMenu = scanner.nextLine();
			if (inputMenu.equals("q")) {
				break;
			} else if (inputMenu.equals("1")) {
				String inputMenu2 = "";
				int studentNum = 0;
		        boolean isScoreValid = false;
		        while (!isScoreValid) {
		        	System.out.println("입력할 학생의 숫자를 입력해주세요.");
					inputMenu2 = scanner.nextLine();
		            try {
		            	studentNum = Integer.parseInt(inputMenu2);
		                isScoreValid = true;
		            } catch (NumberFormatException e) {
		                System.out.println("학생의 수는 숫자로 입력해주세요.");
		            }
		        }
				System.out.println(studentNum +"명의 학생의 이름과 성적을 입력하세요.");
				manager.inputStudents(studentNum);
			} else if (inputMenu.equals("2")) {
				manager.printStudents();
			}
		}
	}
}
