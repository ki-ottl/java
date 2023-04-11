import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		People[] people = new People[9999];
		int index = 0;
		Scanner scanner = new Scanner(System.in);
		for(int i = 0; i < 999999; i++) {
			System.out.println("------------------ 원하시는 메뉴를 선택해주세요. ----------------");
			System.out.println("1. 새 데이터 입력");
			System.out.println("2. 전체 데이터 출력");
			System.out.println("3. 지역별 통계");
			System.out.println("q. 종료");
			
			String menuString = scanner.nextLine();
			if (menuString.equals("q")) {
				break;
			} else if (menuString.equals("1")) {
				people[index] = new People();
				people[index].inputData();
				index++;
			} else if (menuString.equals("2")) {
				for (int j = 0; j < index; j++) {
					people[j].printInfo();
				}
			} else if (menuString.equals("3")) {
				Region[] region = new Region[6];
				region[0] = new Region();
				region[0].name = "서울";
				region[1] = new Region();
				region[1].name = "경기";
				region[2] = new Region();
				region[2].name = "강원";
				region[3] = new Region();
				region[3].name = "경상";
				region[4] = new Region();
				region[4].name = "전라";
				region[5] = new Region();
				region[5].name = "충청";
				
				for (int j = 0; j < region.length; j++) {
					region[j].calcCount(people);
				}
			} else {
				System.out.println("입력이 잘못되었습니다. 확인 후 다시 입력해주세요.");
			}
			System.out.println();
			System.out.println();
		}
	}
}