
public class ArrayStart {

	public static void main(String[] args) {
		
	
		int a1 = 1;
		int a2 = 2;
		int a3 = 3;
		
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3); // 1, 2, 3 출력
		
		// 배열을 사용하는 것이 보다 효율적이다

		int a[] = {1, 2, 3};
		
		for (int i=0 ; i<a.length; i++) {
			System.out.println(a[i]);
		} // 1, 2, 3 출력
		
		double b[] = {1, 2, 3};
		
		for (int i=0 ; i<b.length ; i++) {
			System.out.println(b[i]);
		} // 1.0, 2.0, 3.0 출력
		
		
		String str[] = {"Mon", "Tue", "Wed"};
		// 만약 String str = {"Mon", "Tue", "Wed"}; 라고 기재한다면,
		// cannot convert from String[] to string 에러가 뜨면서
		// 좌우의 자료형이 같지 않으니까 대입이 안된다
		
		for (int i=0 ; i<str.length ; i++) {
			System.out.println(str[i]);
		} // Mon, Tue, Wed 출력
		
		for (int i=0 ; i<4 ; i++) {
			System.out.println(str[i]);
		} 
        // 배열의 인덱스 범위를 넘어섰기 때문에 오류가 생긴다 
        // Exception in thread "main" 
        // java.lang.ArrayIndexOutOfBoundsException: 
        // Index 3 out of bounds for length 3
		
		int[] num  = new int[5]; 
		// new를 이용하여 배열 공간 잡기
		// new : (공간 요청) 메모리 영역에 뭔가를 내가 집어 넣겠다
		// int 자료형으로 몇 칸 잡을 것이다
		
		String[] weekDay = new String[7]; 
		// String 자료형으로 저장공간을 7칸 잡을 것이다	
		
	}

}
