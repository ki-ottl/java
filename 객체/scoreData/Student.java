import java.util.Scanner;

public class Student {
	
	int kor;
	int eng;
	int math;
	String name;
	
	public void name() { 
		Scanner scanner= new Scanner(System.in);
		System.out.println("이름을 입력해주세요");
		String name = scanner.nextLine();
		this.name = name; // 담아주기!!!!!!!!!!!!!!!
	}
	
	public void kor() { 
		Scanner scanner= new Scanner(System.in);
		System.out.println("국어 성적을 입력해주세요");
		String scoreKor = scanner.nextLine();
		int kor = Integer.parseInt(scoreKor);
		this.kor = kor;
	}
	
	public void eng() { 
		Scanner scanner= new Scanner(System.in);
		System.out.println("영어 성적을 입력해주세요");
		String scoreEng = scanner.nextLine();
		int eng = Integer.parseInt(scoreEng);
		this.eng = eng;
	}
	
	public void math() { 
		Scanner scanner= new Scanner(System.in);
		System.out.println("수학 성적을 입력해주세요");
		String scoreMath = scanner.nextLine();
		int math = Integer.parseInt(scoreMath);
		this.math = math;
	}
	
	public int sum() {
		int sum = this.kor + this.eng + this.math;
		return sum;
	}
	
	public double avg() {
		double avg = (this.kor + this.eng + this.math) / 3.0;
		return avg;
	}
	
}

