
public class MainClass {
	public static void main(String[] args) {
		ClassRoom[] classRoom = {new ClassRoom("A반"), new ClassRoom("B반"), 
				new ClassRoom("C반"), new ClassRoom("D반"), new ClassRoom("E반")};
//		Student[] sTemp = {new Student("홍길동", "남자", "서울"), new Student("둘리", "남자", "부산"), new Student("또치", "남자", "부산")};
//		classRoom[0].student = sTemp;
		classRoom[0].addStudent();
		classRoom[0].addStudent();
	}
}
