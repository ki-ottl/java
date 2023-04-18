import java.util.Scanner;

public class ClassRoom {
	String name;
	Student[] student = new Student[100];
	int index = 0;
	int middleScoreTotal = 0;
	int finalScoreTotal = 0;
	
	ClassRoom(String name) {
		this.name = name;
	}

	public void calcTotal() { // for문 하나만 써서 한번에 합산할 수 있다는 점 유의
		this.middleScoreTotal = 0;
		this.finalScoreTotal = 0;
		for (int i = 0; i < this.index; i++) {
			this.middleScoreTotal = this.middleScoreTotal
					+ this.student[i].test[0].total; // 내가 가지고 있는 i번째 학생의 test 0번째(중간고사)의 합
			this.finalScoreTotal = this.finalScoreTotal 
					+ this.student[i].test[1].total; // 내가 가지고 있는 i번째 학생의 test 1번째(기말고사)의 합
		}
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
		System.out.println("4. 시험 총점 출력");
		String selectMenu = scanner.nextLine();
		if (selectMenu.equals("1")) {
			this.addStudent();
		} else if (selectMenu.equals("2")) {
			this.printStudents();
		} else if (selectMenu.equals("3")) {
			this.inputScore();
		} else if (selectMenu.equals("4")) {
			this.calcTotal();
			System.out.println("중간고사 총점 : " + this.middleScoreTotal); // 합산은 다른 메소드를 통해 진행하고,
			System.out.println("기말고사 총점 : " + this.finalScoreTotal); // 담아둔 프로퍼티를 출력하게끔!
		} else {
			System.out.println("입력이 잘못 되었습니다.");
			this.showMenu();
		}
	}
	
	public void printStudents() {
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