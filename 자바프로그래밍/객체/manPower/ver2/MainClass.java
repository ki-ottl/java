import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		
//		People[] people = new People[10]; // 객체배열 생성, 상자 묶음만들고 그 묶음을 people이라 부르겠다.		
//		people[0] = new People(); // 객체 생성, 데이터를 담을 칸만 있는 거니까 데이터를 만들어서 넣어줘야 한다.
//		people[0].address; // 이런 식으로 속성에 접근할 것이다
		
		People[] people = new People[9999]; // 충분한 공간의 객체배열 생성
		
		int index = 0;
		Scanner scanner = new Scanner(System.in);
		for(int i = 0; i < 999999; i++) {
			System.out.println("------------------ 원하시는 메뉴를 선택해주세요. ----------------");
			System.out.println("1. 새 데이터 입력");
			System.out.println("2. 전체 데이터 출력");
			System.out.println("q. 종료");
			
			String menuString = scanner.nextLine();
			if(menuString.equals("q")) {
				break;
			} else if (menuString.equals("1")) {
				people[index] = new People(); //  서류철(객체) 생성, 데이터를 담을 칸만 있는 거니까 데이터를 만들어서 넣어줘야 한다.
//				people[index].name = "홍길동";
//				people[index].address = "서울";
//				people[index].sex = "남성"; // 이렇게 만들기보다는 메소드 이용!
				people[index].inputData();
				index++;
			} else if (menuString.equals("2")) { // 전체출력
				for (int j = 0; j < index ; j++) {
//					System.out.println(people[j].name); // 이런 것보다는 메소드 이용!
					people[j].printInfo();
				}
			} else {
				System.out.println("입력이 잘못되었습니다. 확인 후 다시 입력해주세요.");
			}
		}
		
		System.out.println();
		System.out.println();
	
	}

}
