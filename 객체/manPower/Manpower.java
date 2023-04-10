import java.util.Scanner;

public class Manpower {
	

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