import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		
		// 
		People[] people = new People[9999]; 
		
		int index = 0;
		Scanner scanner = new Scanner(System.in);
		for(int i = 0; i < 9999 ; i++) {
			System.out.println("-----원하시는 메뉴를 선택해주세요.-----");
			System.out.println("1. 새 데이터 입력");
			System.out.println("2. 전체 데이터 출력");
			System.out.println("q. 종료");
			
			String menuString = scanner.nextLine();
			if (menuString.equals("q")) {
				break;
			} else if (menuString.equals("1")) {
				people[index] = new People(); // 서류철 생성
				people[index].inputData();
				index++;
			} else if (menuString.equals("2")) {
				for (int j = 0; j < index; j++) {
					people[j].printInfo(); // 전체 출력
				}
			} else if (menuString.equals("3")) { // 전체출력
				int seoul = 0, gyeonggi = 0, chungcheong = 0, jeonra = 0, gyeongsang = 0, gangwon = 0;
				for (int j = 0; j < index; j++) {
					if (people[j].address.equals("서울")) {
						seoul++;
					} else if (people[j].address.equals("경기")) {
						gyeonggi++;
					} else if (people[j].address.equals("충청")) {
						chungcheong++;
					} else if (people[j].address.equals("전라")) {
						jeonra++;
					} else if (people[j].address.equals("경상")) {
						gyeongsang++;
					} else if (people[j].address.equals("강원")) {
						gangwon++;
					}
				}
				System.out.println("서울 인구 수 : " + seoul);
				System.out.println("경기 인구 수 : " + gyeonggi);
				System.out.println("충청 인구 수 : " + chungcheong);
				System.out.println("전라 인구 수 : " + jeonra);
				System.out.println("경상 인구 수 : " + gyeongsang);
				System.out.println("강원 인구 수 : " + gangwon);
			} else {
				System.out.println("입력이 잘못되었습니다. 확인 후 다시 입력해주세요.");
			}
		}
		System.out.println();
		System.out.println();
	
	}

}