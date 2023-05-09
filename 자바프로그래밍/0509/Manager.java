import java.util.Scanner;

public class Manager {

	Student[] student = new Student[10];

	public void inputStudents() {
		Scanner scanner = new Scanner(System.in);
		for (int j = 0; j < student.length; j++) {
			System.out.println(j + "번째 학생의 정보를 입력하세요.");
			System.out.println("이름 : ");
			String name = scanner.nextLine();
			int score = 0;
			boolean isScoreValid = false;
	        while (!isScoreValid) {
	            System.out.println("성적 : ");
	            String scoreS = scanner.nextLine();
	            try {
	                score = Integer.parseInt(scoreS);
	                if (score < 0 || score > 100) {
	                    System.out.println("성적은 0부터 100 사이의 값으로 입력해주세요.");
	                } else {
	                    isScoreValid = true;
	                }
	            } catch (NumberFormatException e) {
	                System.out.println("성적은 숫자로 입력해주세요.");
	            }
	        }
	        student[j] = new Student(name, score);
	    }
	}

	public void printStudents() {
		for (int j = 0; j < student.length; j++) {
			for (int k = j + 1; k < student.length; k++) {
				if (student[j].score < student[k].score) {
					Student temp = student[k];
					student[k] = student[j];
					student[j] = temp;
				}
			}
		}
		for (int j = 0; j < student.length; j++) {
			System.out.println(j + "등. 이름 : " + student[j].name + ", 점수 : " + student[j].score);
		}
	}
}
