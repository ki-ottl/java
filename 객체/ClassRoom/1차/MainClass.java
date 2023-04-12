import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {

		ClassRoom classA = new ClassRoom();
		ClassRoom classB = new ClassRoom();
		ClassRoom classC = new ClassRoom();

		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < 9999; i++) {
			System.out.println("---------원하시는 메뉴를 선택해주세요.---------");
			System.out.println("1. 학생 정보 입력");
			System.out.println("2. 성적 입력");
			System.out.println("3. 전체 목록 출력");
			System.out.println("4. 전체 성적 출력");

			String inputMenu = scanner.nextLine();
			if (inputMenu.equals("q")) {
				break;
			} else if (inputMenu.equals("1")) {
				// 학생 정보 입력
				System.out.println("정보를 입력할 반을 입력해주세요.");
				System.out.println("1. A반 2. B반 3.C반");
				String selectClass = scanner.nextLine();
				if (selectClass.equals("1")) {
					classA.setname("A반");
					classA.create();
				} else if (selectClass.equals("2")) {
					classB.setname("B반");
					classB.create();
				} else if (selectClass.equals("3")) {
					classC.setname("C반");
					classC.create();
				} // 학생 정보 입력 끝

			} else if (inputMenu.equals("2")) {
				System.out.println("성적을 입력해주세요.");
				System.out.println("1. A반 2. B반 3.C반");
				String selectClass = scanner.nextLine();
				if (selectClass.equals("1")) {
					classA.callScore();
				} else if (selectClass.equals("2")) {
					classB.callScore();
				} else if (selectClass.equals("3")) {
					classC.callScore();

				}
				// 성적 입력
			} else if (inputMenu.equals("3")) {
				
				
				System.out.println("신상 조회를 원하는 반을 입력해주세요.");
				System.out.println("1. A반 2. B반 3.C반 4.전체");
				String selectClass = scanner.nextLine();
				if (selectClass.equals("1")) {
					System.out.println("----A반-----");
					classA.info();
				} else if (selectClass.equals("2")) {
					System.out.println("----B반-----");
					classB.info();
				} else if (selectClass.equals("3")) {
					System.out.println("----C반-----");
					classC.info();				
				} else if (selectClass.equals("4")) {
					System.out.println("----전체-----");
					System.out.println("----A반-----");
					classA.info();
					System.out.println("----B반-----");
					classB.info();
					System.out.println("----C반-----");
					classC.info();
					
			} else if (inputMenu.equals("4")) {
//
//				System.out.println("성적 조회를 원하는 반을 입력해주세요.");
//				System.out.println("1. A반 2. B반 3.C반 4.전체");
//				String selectClass = scanner.nextLine();
//				if (selectClass.equals("1")) {
//					System.out.println("----A반-----");
//					classA.info();
//				} else if (selectClass.equals("2")) {
//					System.out.println("----B반-----");
//					classB.info();
//				} else if (selectClass.equals("3")) {
//					System.out.println("----C반-----");
//					classC.info();				
//				} else if (selectClass.equals("4")) {
//					System.out.println("----전체-----");
//					System.out.println("----A반-----");
//					classA.info();
//					System.out.println("----B반-----");
//					classB.info();
//					System.out.println("----C반-----");
//					classC.info();
					
			} 
		}

	}

}
	
}