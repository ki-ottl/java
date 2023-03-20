
public class Swap {

	public static void main(String[] args) {
		
				// swap 
		
				int a = 3;
				int b = 4;
				int tmp;
				
				System.out.println("a의 값:"+a+",b의 값:"+b);
				
				tmp = a; // 3
				a = b ; // 4 
				b = tmp;
				
				System.out.println("a의 값:"+a+",b의 값:"+b);
				

				int a1[] = {1,2,3};
				// a1 -> reference
				// a1[0], a1[1], a1[2] -> value
				System.out.println(a1); // [I@1eb44e46 : 메모리의 주소 -> reference
				System.out.println(a1[0]); // 1 -> value
				System.out.println(a1[1]); // 2 -> value
				System.out.println(a1[2]); // 3 -> value
		
	
	}

}
