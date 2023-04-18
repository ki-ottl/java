import java.util.Scanner;

public class Trapezium extends Triangle {
	
	int topside;
	int lowerside;
	
	Trapezium() {
		this.name = "사다리꼴";
	}
	
	@Override 
	public void calcSize() {
		this.size = (this.topside + this.lowerside) * this.height / 2;
	}
	
	@Override
	public void inputSize() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Topside : ");
		String inputString = scanner.nextLine();
		this.topside = Integer.parseInt(inputString);
		System.out.println("Lowerside : ");
		String inputString1 = scanner.nextLine();
		this.lowerside = Integer.parseInt(inputString1);
		System.out.println("Height : ");
		String inputString2 = scanner.nextLine();
		this.height = Integer.parseInt(inputString2);
	}

}
