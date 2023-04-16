
public class ValueAndReference {

	public static void main(String[] args) {

		
		int num[] = new int[5];
		System.out.println(num); // [I@1ee0005 (메모리의 주소값 출력)
		
		for(int i=0; i<num.length; i++) {
			System.out.println(num[i]);
		} // 0만 5개 출력
	
		String str[] = new String[5];
		
		System.out.println(str); // [Ljava.lang.String;@6504e3b2
        						 // (메모리의 주소값 출력)
		
		for(int i=0; i<str.length; i++) {
			System.out.println(str[i]);
		} // null만 5개 출력 
		
		num[0] = 1;
		num[1] = 2;
		num[2] = 3;
		num[3] = 4;
		num[4] = 5; // 배열에 값 대입
		
		for(int i=0; i<num.length; i++) {
			System.out.println(num[i]);
		} // 1, 2, 3, 4, 5 (value 출력)  
		
		str[0] = "A";
		str[1] = "B";
		str[2] = "C";
		str[3] = "D";
		str[4] = "E"; // 배열에 값 대입
		
		for(int i=0; i<str.length; i++) {
			System.out.println(str[i]);
		} // A, B, C, D, E (value 출력)

	}

}
