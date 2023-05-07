import java.io.FileInputStream;
import java.util.Arrays;
import java.util.Scanner;

public class D0410Q6 {

	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("src/inputAS.txt"));
		Scanner sc = new Scanner(System.in);

//		주어진 2차원 배열의 시작(x1, y1) 위치부터 종료 (x2, y2) 위치까지 저장되어 있는
//		수들의 합을 구하는 프로그램을 작성하시오. 배열의 (i, j) 위치는 i행 j열을 나타낸다
//		입력 값
//		2 3 
//		2 4 8
//		10 12 14
//		3 
//		1 1 2 3
//		1 2 1 2
//		1 3 2 3
//
//		출력값
//		50
//		4
//		22

        // 2차원 배열의 크기를 입력 받음
        int n = sc.nextInt();
        int m = sc.nextInt();
        // n+1, m+1까지의 크기를 갖는 2차원 배열을 생성
        int[][] arr = new int[n + 1][m + 1];

        // 배열에 값을 입력 받음
        for (int i = 1; i < n+1 ; i++) {
            for (int j = 1; j < m+1; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        // 구간 합을 구하기 위한 좌표 정보를 입력 받음
        int k = sc.nextInt();
        for (int i = 0; i < k; i++) {
            // 구간을 나타내는 좌표 정보를 입력 받음
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();
            int sum = 0;

            // 구간의 부분합을 구함
            for (int j = x1; j < x2+1; j++) {
                for (int l = y1; l < y2+1 ; l++) {
                    sum += arr[j][l];
                }
            }

            // 구간의 부분합을 출력
            System.out.println(sum);
        }
    }
}
