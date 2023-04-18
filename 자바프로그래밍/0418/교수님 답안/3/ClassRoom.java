import java.util.Scanner;

public class ClassRoom {
	String name;
	Student[] student = new Student[100];
	int index = 0;
	
	ClassRoom() {
//		student = new Student[100];
	}
	
	ClassRoom(String name) {
		this.name = name;
	}
	
	public void addStudent() {
		System.out.println("추가할 학생 정보를 입력해주세요.");
		Scanner scanner = new Scanner(System.in);
		System.out.println("이름 : ");
		String name = scanner.nextLine();
		System.out.println("성별 (남자 or 여자) : ");
		String sex = scanner.nextLine();
		System.out.println("주소 (서울, 부산 ...) : ");
		String address = scanner.nextLine();
		this.student[this.index] = new Student(name, sex, address);
		this.index++;
	}
	
	public void showMenu() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("1. 학생 추가");
		System.out.println("2. 학생 목록 출력");
		System.out.println("3. 시험 점수 입력");
		String selectMenu = scanner.nextLine();
		if (selectMenu.equals("1")) {
			this.addStudent();
		} else if (selectMenu.equals("2")) {
			this.printStudents();
		} else if (selectMenu.equals("3")) {
			this.inputScore();
		} else {
			System.out.println("입력이 잘못 되었습니다.");
			this.showMenu();
		}
	}
	
	public void printStudents() { //.toString() 이 생략되어있다.
		for (int i = 0; i < this.index; i++) {
			System.out.println("" + i + " : "
				+ student[i]);
		}
	}
	
	@Override
	public String toString() {
		return this.name + " (" + this.index + "명)";
	}
	
	public void inputScore() {
		this.printStudents();
		Scanner scanner = new Scanner(System.in);
		System.out.println("입력을 원하는 학생 선택");
		String selectStudent = scanner.nextLine();
		int selectStudentNumber = Integer.parseInt(selectStudent);
		if (this.student[selectStudentNumber] != null) {
			this.student[selectStudentNumber].showMenu();
		}
	}
}
