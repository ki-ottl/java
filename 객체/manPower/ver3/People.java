import java.util.Scanner;

public class People {
	
	String name;
	String address;
	String sex;
	
	public void inputData() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("이름을 입력해주세요.");
		this.name = scanner.nextLine();
		System.out.println("주소를 입력해주세요.");
		this.address = scanner.nextLine();
		System.out.println("성별을 입력해주세요.");
		this.sex = scanner.nextLine();
	} // 내 자신에 대한 (객체에 대한) 각각의 내용을 적는 것!
	  // 전체 관리할 수 있는 애는 한번에 묶어서 관리하는 곳에서 해야하기 때문에
	  // main에서 처리를 해야한다. 
	  // 아니면 관리자라는 객체를 새로 생성해서 만들어주는 방법이 있다.
	
	public void printInfo() {
		System.out.println("이름:"+this.name+", 주소:"+this.address+", 성별:"+this.sex);
	}
	
	
	

}