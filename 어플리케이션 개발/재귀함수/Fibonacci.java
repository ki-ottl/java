
public class Fibonacci {

	public static void main(String[] args) {
		
		System.out.println(fibonacci(10)); // 55 
	
	}
	
	
	public static int fibonacci (int number) {
		
		if(number==1) return 1;
		else if(number==2) return 1;
		else return fibonacci(number-1) + fibonacci(number-2);
		
	}
	
}
