import java.util.Scanner;

public class Test {
	String category;
	int korScore;
	int engScore;
	int mathScore;
	
	int total;
	int avg;

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
	
	public void totalScore(String className) {
		this.total = this.korScore + this.engScore + this.mathScore;
		this.avg = (this.korScore + this.engScore + this.mathScore)/3;
		System.out.println(className+"의 "+this.category+" 총점은 "+this.total+"이고, 평균은 "+this.avg+"입니다.");
	}

}
