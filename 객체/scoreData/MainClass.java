import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {

		// 1. 객체 데이터 사용
		// 2. 학생 30명의 성적 데이터를 입력받아서 (국어, 영어, 수학) 각 과목별 총점과 평균을 출력하세요.

		Student[] student = new Student[30];

		for (int i = 0; i < student.length; i++) {
			// 객체생성
			student[i] = new Student();
			// 데이터 입력
			student[i].name();
			student[i].kor();
			student[i].eng();
			student[i].math();
			student[i].sum();
			student[i].avg();
		}

		for (int i = 0; i < student.length; i++) {
			System.out.println("이름 : " + student[i].name + " / 총합 :" + student[i].sum() + " / 평균 : " + student[i].avg());
		}

	}

}
