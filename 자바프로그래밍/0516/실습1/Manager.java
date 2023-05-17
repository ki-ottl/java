import java.util.ArrayList;
import java.util.Scanner;

public class Manager {

	ArrayList<Student> student = new ArrayList<Student>();
	
	int count = 0;

	public void inputStudents(int numStudents) {
	    Scanner scanner = new Scanner(System.in);
	    for (int j = 0; j < numStudents; j++) {
	        System.out.println((count+1) + "번째 학생의 정보를 입력하세요.");
	        System.out.println("이름 : ");
	        String name = scanner.nextLine();
	        int score = 0;
	        boolean isScoreValid = false;
	        while (!isScoreValid) {
	            System.out.println("성적 : ");
	            String scoreS = scanner.nextLine();
	            try {
	                score = Integer.parseInt(scoreS);
	                isScoreValid = true;
	            } catch (NumberFormatException e) {
	                System.out.println("성적은 숫자로 입력해주세요.");
	            }
	        }
	        student.add(new Student(name, score));
	        count++;
	    }
	}

	public void printStudents() {
		
		for (int j = 0; j < student.size(); j++) {
			for (int k = j + 1; k < student.size(); k++) {
				if (student.get(j).score < student.get(k).score) {
					Student temp = student.get(k);
					student.set(k, student.get(j));
	                student.set(j, temp);
				}
			}
		}
		
		int max = student.get(0).score;
		int countMax = 0;
		
		for (int j = 0 ; j < student.size(); j++) {
			if (student.get(j).score==max) {
				countMax++;
			}
		}
		
		for (int j = 0; j < countMax ; j++) {
			System.out.println("최고점 학생) 이름 : " + student.get(j).name + ", 점수 : " + student.get(j).score);
		}
		
//		ArrayList<Student> student = new ArrayList<Student>();
//		this.student = student; // 만약에 등수 초기화를 하고 싶다면~!!
		 
	}
}