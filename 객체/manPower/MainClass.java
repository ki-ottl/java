public class MainClass {

	public static void main(String[] args) {

//		인력 관리 프로그램을 작성하시오
//
//		각 인원은 이름, 주소, 성별을 입력 받음. 
//		주소는 서울, 경기, 강원, 충청, 전라, 경상 (6개만 사용)
//		이런식으로 가장 큰 지역 이름만 입력
		
//		step1. 10명의 데이터를 입력 받아서 위 내용 구현
//		입력된 데이터는 전체 출력, 지역별 인구 수 출력, 성별 인구 수 출력
//
//		숙제는 다음 스탭대로 진행하세요.
//		step1. 10명의 데이터를 입력 받아서 위 내용 구현
//		step2. 다음 사항으로 개선
//		1. 주소는 문자열 입력이 아닌 메뉴에서 선택해서 입력할 수 있게 하세요. (오입력 방지)

		

		Manpower[] manpower = new Manpower[10];

		for (int i = 0; i < manpower.length; i++) {
			manpower[i] = new Manpower(); // 객체생성
			manpower[i].name(); // 데이터 입력
			manpower[i].address();
			manpower[i].printAddress();
			manpower[i].gender();
			manpower[i].printGender();
		}

		for (int i = 0; i < manpower.length; i++) {
			System.out.println("이름 : " + manpower[i].name + " / 주소 : " + manpower[i].printaddress + " / 성별 : "
					+ manpower[i].printgender);
		}


		int seoulTotal = 0;
		int kyungkiTotal = 0;
		int gangwonTotal = 0;
		int chungcheongTotal = 0;
		int jeonraTotal = 0;
		int kyungsangTotal = 0;

		for (int i = 0; i < manpower.length; i++) {
			if (manpower[i].address == 1)
				seoulTotal = seoulTotal + 1;
			else if (manpower[i].address == 2)
				kyungkiTotal = kyungkiTotal + 1;
			else if (manpower[i].address == 3)
				gangwonTotal = gangwonTotal + 1;
			else if (manpower[i].address == 4)
				chungcheongTotal = chungcheongTotal + 1;
			else if (manpower[i].address == 5)
				jeonraTotal = jeonraTotal + 1;
			else if (manpower[i].address == 6)
				kyungsangTotal = kyungsangTotal + 1;
		}

		System.out.println("지역 별 인구수 : 서울-" + seoulTotal + ", 경기-" + kyungkiTotal + ", 강원-" + gangwonTotal + ", 충청-"
				+ chungcheongTotal + ", 전라-" + jeonraTotal + ", 경상-" + kyungsangTotal);

		int female = 0;
		int male = 0;

		for (int i = 0; i < manpower.length; i++) {

			if (manpower[i].gender == 1)
				female = female + 1;
			else if (manpower[i].gender == 2)
				male = male + 1;

		}

		System.out.println("성별 인구수 : 여성-" + female + ", 남성-" + male);
	}
}