import java.util.Scanner;

public class Circle extends Triangle {
	
	int radius;
	
	Circle() {
		this.name = "원";
	}
	
	@Override 
	public void calcSize() {
	this.size = Math.pow(this.radius, 2)* Math.PI;
	}
	
	@Override
	public void inputSize() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Radius : ");
		String inputString = scanner.nextLine();
		this.radius = Integer.parseInt(inputString);
	}

}