
public class Test {
	String name;
	int kor;
	int eng;
	int math;
	int total;
	
	Test(String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.total = kor + eng + math;
	}
}
