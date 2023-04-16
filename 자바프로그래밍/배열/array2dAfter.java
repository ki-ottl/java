import java.util.Scanner;

public class array2dAfter {

	public static void main(String[] args) {
		
		// 사용자에게 9개의 숫자를 입력받아서 3*3의 이중 배열에 넣은 후 각행의 덧셈 합을 출력하시오
		// 조건1) 출력 시 4*4의 형식으로 출력 (4행째는 덧셈합)
		// 조건2) 데이터 출력시 정렬된 형식으로 출력
		// 비고. 이중배열 사용법 int[][] arr = new int[4][4];
		// 비고. 데이터를 정렬된 형식으로 출력하는 방법을 찾아보시오.
		
		
		// 리팩토링 후
		
		Scanner scanner = new Scanner(System.in);

		int[][] arr = new int[4][4];

		for (int i = 0; i < 4; i++) {

			for (int j = 0; j < 4; j++) {
				
				if (i == 3 || j == 3) {
					
				} else {
					String inputNumber = scanner.nextLine();
					arr[i][j] = Integer.parseInt(inputNumber);
				}
				
				if (j == 3) {
					arr[i][3] = arr[i][0] + arr[i][1] + arr[i][2];
				} 
				
				if (i == 3) {
					arr[3][j] = arr[0][j] + arr[1][j] + arr[2][j];
				} 
				
				if (i == 3 && j == 3) {
					arr[3][3] = arr[0][3]+arr[1][3]+arr[2][3]+arr[3][0]+arr[3][1]+arr[3][2];
				}
			}
			
			}

		for (int a = 0; a < 4; a++) {
			for (int b = 0; b < 4; b++) {
				System.out.print("arr[" + a + "][" + b + "]=" + arr[a][b] + "	|	");
			}
			System.out.println();

		}

	}

	
}
