import java.util.Random;

public class Circle extends Base {
	private double half;
	
	Circle() {
		super();
		this.name = "원";
	}
	
	@Override
	protected void inputNumber() {
		Random random = new Random();
		this.half = random.nextInt(100)+1;
	}
	
	@Override
	protected void calcSize() {
		this.size = this.half * this.half * Math.PI;
		this.size = Math.round((this.size * 100) / (double)100);
		// 312.1211121
		// 31212.11121
		// 31212
		// 312.12
	}
	
	@Override
	protected void printSize() {
		super.printSize();
	}
}
