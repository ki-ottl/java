
public class MinMaxOfArray {

	public static void main(String[] args) {
	
		int num[] = new int[5];
		
		num[0] = 2; // zero-based index
		num[1] = 3;
		num[2] = 1;
		num[3] = 5;
		num[4] = 4;
		// 선언 시 초기화 해주는 습관
		int min = Integer.MAX_VALUE; // ★ 최소값을 담을 변수를 초기화 할 때는 최대값으로 초기화
								     // Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE; // ★ 최대값을 담을 변수를 초기화 할 때는 최소값으로 초기화
								     // Integer.MIN_VALUE;
		
		// 배열의 최소,최대값을 뽑아보세요
		// num.max (사용할 수 없음)
		
		// local variable min have not been initialized
		// 초기화가 안되었기 때문에 에러
		
		for(int i=0; i<num.length; i++) {
			if(num[i] < min) {
				min = num[i];
			}
			if (num[i] > max) {
				max = num[i];
			}
		}  
		
		/*
		for(int i=0; i<num.length; i++) {
			if(num[i] < min) min = num[i];
			if (num[i] > max) max = num[i];
		}  // 조건이 한 줄이면 괄호 생략 가능하다
		*/
		
		System.out.println("Max Value is "+max);
		System.out.println("Min Value is "+min);
		
		
	}

}
