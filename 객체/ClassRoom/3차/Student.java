import java.util.Scanner;

public class Student {
	int studentNum;
	String name; // 학생이름
	String address; // 주소
	String sex;

	Test[] test = new Test[2];
	// Test middleTest;
	// Test finalTest;
	
	public void setNum(int num) {
		// 1번 학생, 2번 학생
		this.studentNum = num;
	}

	// 학생 정보 입력
	public void inputData(String className) {
		Scanner scanner = new Scanner(System.in);
		System.out.println(className + " " + this.studentNum + "번째 학생의 정보를 입력해주세요.");
		System.out.print("이름 : ");
		this.name = scanner.nextLine();
		System.out.print("주소 : ");
		this.address = scanner.nextLine();
		System.out.print("성별 : ");
		this.sex = scanner.nextLine();
	}
	
	public void callInputScore(String className) {
		System.out.println(className + " " + this.studentNum + "번째 학생의 성적를 입력해주세요.");
		test[0] = new Test();
		test[0].setCategory("중간고사");
		test[0].inputScore(className, name);
		test[1] = new Test();
		test[1].setCategory("기말고사");
		test[1].inputScore(className, name);
	}

	// 전체정보 출력
	public void printInfo(String className) {
		System.out.println(className + " " + this.studentNum + ". 이름 : " + this.name + "주소 : " + this.address + "성별 : "
				+ this.address);
	}
	
	public void scoreInfo2(String className) {	
		test[0].totalScore(className);
		test[1].totalScore(className);
	}

}