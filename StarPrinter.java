
public class StarPrinter {

	public static void main(String[] args) {
		
		
//		 *
//		 **
//		 ***
//		 ****
//		 *****
		
		// 개행 0 > 1 > 2 > 3 > 4
		// 출력 1 > 2 > 3 > 4 > 5
		
		
		for (int i = 0 ; i < 5 ; i++) {
			for (int j = 0 ; j < (i+1) ; j++) {
				System.out.print("*");
			} System.out.println();
		}
		
		
//		 1
//		 12
//		 123
//		 1234
//		 12345
		
		
		// 개행 0 > 1 > 2 > 3 > 4
		// 출력 1 > 2 > 3 > 4 > 5
		// 숫자 1 > 2 > 3 > 4 > 5
		
		
		for (int i = 0 ; i < 5; i++) {
			for (int j = 0 ; j < (i+1); j++ ) {
				System.out.print(j+1);
			} System.out.println();
		}
		
		
//	     1
//	    333
//	   55555
//	  7777777
//	 999999999
		
		
		// 공백 4 > 3 > 2 > 1
		// 출력 + 숫자 1 > 3 > 5 > 7 > 9
		// 개행 0 > 1 > 2 > 3 > 4
			
		
		for (int i = 0 ; i < 5 ; i++) {
			
			for (int j = 0 ; j < 4-i ; j++) {
				System.out.print(" ");
			} 
				
			for (int j = 0 ; j < (2*i)+1 ; j++) {
				System.out.print((2*i)+1);
			} System.out.println();
			
		}
		
		
//		*******
//		 ******
//		  *****
//		   ****
//		    ***
//		     **
//		      *
		
		
		// 공백 0 > 1 > 2 > 3 > 4 > 5 > 6 
		// 출력 7 > 6 > 5 > 4 > 3 > 2 > 1
		// 개행 0 > 1 > 2 > 3 > 4 > 5 > 6
			
		
		for (int i = 0 ; i < 7 ; i++) {
			
			for (int k = 0 ; k < i; k++) {
				System.out.print(" ");
			} 
			
			for (int j = 0 ; j < (7-i) ; j++) {
				System.out.print("*");
			} System.out.println();
				
			}

		}
	
		
}
