import java.util.Scanner;

public class Student {
	String name;
	int score;
	boolean InClassroom;
	String className;
	
	Student() {
		this.InClassroom = false;
		this.className = "반배정 필요";
	}
	
	Student(String name, int score) {
		this();
		this.name = name;
		this.score = score;
	}
	
	@Override
	public String toString() {
		return this.name + " ( 점수 : " + this.score + " / 반 : " + this.className+ " )";
	}
}