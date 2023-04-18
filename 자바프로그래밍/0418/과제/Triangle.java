import java.util.Scanner;

public class Triangle {
	String name;
	int width;
	int height;
	double size;
	
	Triangle() {
		this.name = "삼각형";
	}
	
	public void info() {
		System.out.println("======="+this.name+"의 넓이를 구하려고 합니다."+"=======");
		System.out.println("아래 사항을 입력해주세요.");
	}
	
	public void inputSize() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Width : ");
		String inputString = scanner.nextLine();
		this.width = Integer.parseInt(inputString);
		System.out.println("Height : ");
		inputString = scanner.nextLine();
		this.height = Integer.parseInt(inputString);
	}
	public void calcSize() {
		this.size = this.width * this.height / (double)2;
	}
	public void printSize() {
		System.out.println(this.name + " size : " + this.size);
	}
	public void doAction() {
		this.info();
		this.inputSize();
		this.calcSize();
		this.printSize();
	}
}
