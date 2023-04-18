import java.util.Scanner;

public class Student {
	String name;
	String sex;
	String address;
	Test[] test = new Test[2];
	
	Student(String name) {
		this.name = name;
	}
	
	Student(String name, String sex, String address) {
		this.name = name;
		this.sex = sex;
		this.address = address;
	}
	
	@Override
	public String toString() {
		return this.name + " (" + this.sex + ", " + this.address + ")";
	}
	
	public void showMenu() { // 시험 성적 입력받기 위한 메뉴
		Scanner scanner = new Scanner(System.in);
		System.out.println("1. 중간고사 성적 입력");
		System.out.println("2. 기말고사 성적 입력");
		String selectMenu = scanner.nextLine();
		if (selectMenu.equals("1")) {
			System.out.println("국어 점수 : ");
			String inputScore = scanner.nextLine();
			int kor = Integer.parseInt(inputScore);
			System.out.println("영어 점수 : ");
			inputScore = scanner.nextLine();
			int eng = Integer.parseInt(inputScore);
			System.out.println("수학 점수 : ");
			inputScore = scanner.nextLine();
			int math = Integer.parseInt(inputScore);
			this.test[0] = new Test("중간고사", kor, eng, math);
		} else if (selectMenu.equals("2")) {
			System.out.println("국어 점수 : ");
			String inputScore = scanner.nextLine();
			int kor = Integer.parseInt(inputScore);
			System.out.println("영어 점수 : ");
			inputScore = scanner.nextLine();
			int eng = Integer.parseInt(inputScore);
			System.out.println("수학 점수 : ");
			inputScore = scanner.nextLine();
			int math = Integer.parseInt(inputScore);
			this.test[1] = new Test("기말고사", kor, eng, math);
		} else {
			System.out.println("입력이 잘못 되었습니다.");
			this.showMenu();
		}
	}
}
