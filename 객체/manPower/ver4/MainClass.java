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
				String[] region = {"서울", "경기", "충청", "전라", "경상", "강원"};
				int[] regionCount = new int[region.length];
				for (int j = 0; j < index; j++) {
					for (int k = 0; k < region.length; k++) {
						if (region[k].equals(people[j].address)) {
							regionCount[k]++;
						}
					}
				}
				for (int k = 0; k < region.length; k++) {
					System.out.println(region[k] + " 인구 수 : " + regionCount[k]);
				}
			} else {
				System.out.println("입력이 잘못되었습니다. 확인 후 다시 입력해주세요.");
			}
			System.out.println();
			System.out.println();
		}
	}
}