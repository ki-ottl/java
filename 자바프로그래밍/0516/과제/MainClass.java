import java.util.*;

public class MainClass {
	public static void main(String[] args) {
		// 수동 데이터
		Student[] student = { new Student("홍길동", 100), new Student("둘리", 10), new Student("도우너", 30),
				new Student("또치", 50), new Student("희동이", 100), new Student("마이콜", 20), new Student("이순신", 100),
				new Student("이성계", 50), new Student("강감찬", 80), new Student("궁예", 10), new Student("허준", 90),
				new Student("박혁거세", 70), new Student("하니", 30), new Student("나예리", 70), new Student("고길동", 80), };

		ArrayList<ClassRoom> classRoom = new ArrayList<ClassRoom>();
		classRoom.add(new ClassRoom("A반"));
		classRoom.add(new ClassRoom("B반"));
		classRoom.add(new ClassRoom("C반"));

		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < 999999; i++) {
			System.out.println("1. 반 배정");
			System.out.println("2. 반 변경");
			System.out.println("3. 반 추가");
			System.out.println("4. 학생 조회");
			System.out.println("5. 순위 조회");
			System.out.println("q. 종료");
			String selectMenu = scanner.nextLine();
			if (selectMenu.equals("1")) {

				for (int k = 0; k < classRoom.size(); k++) {
					for (int j = 0; j < student.length; j++) {
						if (classRoom.get(k).innerStudents.contains(student[j])) {
							student[j].InClassroom = true;
						}
					}
				}

				for (int j = 0; j < student.length; j++) {
					if (!student[j].InClassroom) {
						System.out.println("" + j + " : " + student[j]);
					}
				}

				System.out.println("학생 번호 : ");
				String selectStudent = scanner.nextLine();
				int selectStudentNumber = Integer.parseInt(selectStudent);

				for (int j = 0; j < classRoom.size(); j++) {
					System.out.println("" + j + " : " + classRoom.get(j));
				}
				System.out.println("반 번호 : ");
				String selectClassRoom = scanner.nextLine();
				int selectClassRoomNumber = Integer.parseInt(selectClassRoom);

				classRoom.get(selectClassRoomNumber).innerStudents.add(student[selectStudentNumber]);
				student[selectStudentNumber].className = classRoom.get(selectClassRoomNumber).name;

			} else if (selectMenu.equals("2")) {

				for (int k = 0; k < classRoom.size(); k++) {
					for (int j = 0; j < student.length; j++) {
						if (classRoom.get(k).innerStudents.contains(student[j])) {
							student[j].InClassroom = true;
						}
					}
				}

				System.out.println("=======반 변경 가능 학생 목록=======");

				for (int j = 0; j < student.length; j++) {
					if (student[j].InClassroom) {
						System.out.println("" + j + " : " + student[j]);
					}
				}

				System.out.println("================================");

				System.out.println("반 변경이 필요한 학생 번호를 입력해주세요.");
				System.out.println("학생 번호 : ");
				String selectStudent = scanner.nextLine();
				int selectStudentNumber = Integer.parseInt(selectStudent);

				System.out.println("=========변경 가능 학급 목록=========");
				for (int j = 0; j < classRoom.size(); j++) {
					System.out.println("" + j + " : " + classRoom.get(j));
				}
				System.out.println("================================");

				System.out.println("변경할 반 번호를 입력해주세요.");
				System.out.println("반 번호 : ");
				String selectClassRoom = scanner.nextLine();
				int selectClassRoomNumber = Integer.parseInt(selectClassRoom);

				int orgRoomNumber = classRoom.size() + 1;
				for (int k = 0; k < classRoom.size(); k++) {
					for (int j = 0; j < student.length; j++) {
						if (student[j].className == classRoom.get(k).name) {
							orgRoomNumber = k;
						}
					}
				}

				classRoom.get(orgRoomNumber).innerStudents.remove(student[selectStudentNumber]);
				classRoom.get(selectClassRoomNumber).innerStudents.add(student[selectStudentNumber]);
				student[selectStudentNumber].className = classRoom.get(selectClassRoomNumber).name;

				System.out.println(student[selectStudentNumber].name + "의 반이 " + student[selectStudentNumber].className
						+ "로 변경되었습니다.");

			} else if (selectMenu.equals("3")) {
				System.out.println("새롭게 생성할 반 이름을 적어주세요.");
				String addClassRoomName = scanner.nextLine();
				classRoom.add(new ClassRoom(addClassRoomName));
			} else if (selectMenu.equals("4")) {

				for (int j = 0; j < student.length; j++) {
					System.out.println("" + j + " : " + student[j]);

				}
				
			} else if (selectMenu.equals("5")) {
				
//				System.out.println("======="+classRoom.get(0).name+"의 순위=======");
//				
//				for (int j = 0; j < classRoom.get(0).innerStudents.size(); j++) {
//					for (int k = j + 1; k < classRoom.get(0).innerStudents.size() ; k++) {
//						if (classRoom.get(0).innerStudents.get(j).score < classRoom.get(0).innerStudents.get(k).score) {
//							Student temp = classRoom.get(0).innerStudents.get(j);
//							classRoom.get(0).innerStudents.set(j, classRoom.get(0).innerStudents.get(k));
//							classRoom.get(0).innerStudents.set(k, temp);
//						}
//					}
//				}
//				
//				System.out.println(classRoom.get(0).innerStudents);
//				
//				int countA = 1;
//				for (int j = 0; j < student.length; j++) {
//					if (student[j].InClassroom&&student[j].className==classRoom.get(0).name) {
//						System.out.println(countA +"등 : " + student[j].name + " / " + student[j].score+"점");
//						countA++;
//					}
//				}
				
			} else if (selectMenu.equals("q")) {
				break;
			}

		}

	} // main
}