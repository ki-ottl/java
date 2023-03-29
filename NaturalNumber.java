
public class NaturalNumber {

	public static void main(String[] args) {
		
		System.out.println(naturalNumber(200)-naturalNumber(100));

	}
	
	public static int naturalNumber (int number) {
		
		if (number != 0) return number + naturalNumber(number-1);
		else return number;
		
	}

}
