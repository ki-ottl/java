import java.util.Scanner;

// 1학년 내 클래스
public class ClassRoom {
	String className; // A반, B반... 
	Student[] student = new Student[100];
	int index = 0;
	String teacher;
	Scanner scanner = new Scanner(System.in);

	// 반이름 생성
	public void setname(String name) {
		this.className = name;
	}
	
	// 학생 생성후, 학생번호,  학생 정보입력 호출
	public void create() {
		
		for(int i=0 ; i < this.student.length ; i++) {
			System.out.println("----"+this.className+" 정보 입력----");
			System.out.println("1. 학생정보 입력 2. 학생정보 입력 종료");
			String inputNum = scanner.nextLine();
			if (inputNum.equals("2")) {
				break;
			} else if (inputNum.equals("1")) {
				student[index] = new Student(); // 학생 생성
				student[index].setNum(index + 1);
				student[index].inputData(this.className);
				index++;
			}
		}
		}
	
	public void callScore() {
		for (int i = 0; i < index; i++ ) {
			student[i].callInputScore(this.className); 
		}
		}

	public void info() {
		for (int i =0; i < index; i++) {
			student[i].printInfo(this.className);
		}
	}
	
	public void scoreInfo() {
		for (int i =0; i < index; i++) {
			student[i].scoreInfo2(this.className);
			
		}
	}
	
}
