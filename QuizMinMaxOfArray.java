import java.util.Scanner;

public class QuizMinMaxOfArray {

	public static void main(String[] args) {
		
		// step.0 숫자를 입력해주세요 출력 * 5번 + 숫자를 입력 받아서 저장하기
		// 입력받을 숫자를 담을 공간이 필요해서 배열을 선언하고 그 값들을 같이 넣어주었다
		
		Scanner s = new Scanner(System.in);
		
		int num[] = new int[5]; // 입력받을 숫자를 담을 배열 선언.
		
		System.out.println("숫자를 입력해주세요");
		int num1 = s.nextInt();
		num[0] = num1;
	
		System.out.println("숫자를 입력해주세요");
		int num2 = s.nextInt();
		num[1] = num2;
		
		System.out.println("숫자를 입력해주세요");
		int num3 = s.nextInt();
		num[2] = num3;
		
		System.out.println("숫자를 입력해주세요");
		int num4 = s.nextInt();
		num[3] = num4;
		
		System.out.println("숫자를 입력해주세요");
		int num5 = s.nextInt();
		num[4] = num5;
		
		
		int min = Integer.MAX_VALUE; // 조건문을 사용하여 비교할 것이기 때문에, 아래와 같이 최소값과 최대값을 초기화. 
		int max = Integer.MIN_VALUE; 
		
		
		// 값을 비교하는 작업을 5번 할 것이기 때문에 for문을 사용해주었다.
		
		for (int i = 0 ; i<num.length ; i++) {
			if (num[i] < min) min = num[i];
			if (num[i] > max) max = num[i];
		}
		
		System.out.println("최대값 : "+max+" / 최소값 : "+min);
		
	}

}
