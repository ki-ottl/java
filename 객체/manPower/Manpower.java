import java.util.Scanner;

public class Manpower {
	
//	인력 관리 프로그램을 작성하시오
//
//	각 인원은 이름, 주소, 성별을 입력 받음. 
//	주소는 서울, 경기, 강원, 충청, 전라, 경상 (6개만 사용)
//	이런식으로 가장 큰 지역 이름만 입력
	
//	step1. 10명의 데이터를 입력 받아서 위 내용 구현
//	입력된 데이터는 전체 출력, 지역별 인구 수 출력, 성별 인구 수 출력
//
//	숙제는 다음 스탭대로 진행하세요.
//	step1. 10명의 데이터를 입력 받아서 위 내용 구현
//	step2. 다음 사항으로 개선
//	1. 주소는 문자열 입력이 아닌 메뉴에서 선택해서 입력할 수 있게 하세요. (오입력 방지)

	String name;
	int address;
	int gender;
	String printaddress;
	String printgender;
	
	int male = 0;
	int female = 0;
	
	int addresscount;
	
	
	public void name() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("이름을 입력해주세요");
		String name = scanner.nextLine();
		this.name = name;
	}
	
	public void address() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("해당하는 지역 번호를 입력해주세요.");
		System.out.println("1. 서울 / 2. 경기 / 3. 강원 / 4. 충청 / 5. 전라 / 6. 경상");
		String addressNum = scanner.nextLine();
		int address = Integer.parseInt(addressNum);
		this.address = address;
	}
	
	public String printAddress() {
		if (this.address==1) printaddress="서울";
		else if (this.address==2) printaddress="경기";
		else if (this.address==3) printaddress="강원";
		else if (this.address==4) printaddress="충청";
		else if (this.address==5) printaddress="전라";
		else if (this.address==6) printaddress="경상";
		return printaddress;
	}
	
	public void gender() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("성별을 입력해주세요(1. 여성 / 2. 남성 중 택1)");
		String genderNum = scanner.nextLine();
		int gender = Integer.parseInt(genderNum);
		this.gender = gender;
		if (gender==1) this.female++;
		else if (gender==2) this.male++;
	}
	
	public String printGender() {
		if (this.gender==1) printgender="여성";
		else if (this.gender==2) printgender="남성";
		return printgender;
	}

}