import java.util.Random;
import java.util.Scanner;

public class Triangle extends Base {
	private int width;
	private int height;
	
	Triangle() {
		this.name = "삼각형";
	}
	
	@Override
	protected void inputNumber() {
		Random random = new Random();
		this.width = random.nextInt(100)+1;
		this.height = random.nextInt(100)+1;
	}
	
	@Override
	protected void calcSize() {
		this.size = this.height * this.width / (double)2;
	}
}
