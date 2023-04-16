import java.util.Scanner;

public class Test {
	String category;
	int korScore;
	int engScore;
	int mathScore;

	public void setCategory(String test) {
		this.category = test;
	}

	public void inputScore(String className, String name) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("==========================");
		System.out.println(className + " " + name + " 학생의 "  + this.category + "점수를 입력해주세요.");
		
		System.out.print("국어 점수 : ");
		this.korScore = scanner.nextInt();
		System.out.print("영어 점수 : ");
		this.engScore = scanner.nextInt();
		System.out.print("수학 점수 : ");
		this.mathScore = scanner.nextInt();		
		if (this.korScore < 0 || this.korScore > 100||this.engScore < 0 || this.engScore > 100 || this.mathScore < 0 || this.mathScore > 100) {
			System.out.println("0~100 사이로 입력해주세요");
			inputScore( className, name); // 재귀함수
		}
	}
	
//	public void totalScore() {
//		System.out.println(className +);
//		
//	}

}
