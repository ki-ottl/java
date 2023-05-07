import java.util.Arrays;
import java.util.Scanner;

//배열 array의 i번째 숫자부터 j번째 숫자까지 자르고 정렬했을 때, k번째에 있는 수를 구하려 합니다.
//
//예를 들어 array가 [1, 5, 2, 6, 3, 7, 4], i = 2, j = 5, k = 3이라면
//
//array의 2번째부터 5번째까지 자르면 [5, 2, 6, 3]입니다.
//1에서 나온 배열을 정렬하면 [2, 3, 5, 6]입니다.
//2에서 나온 배열의 3번째 숫자는 5입니다.
//배열 array, [i, j, k]를 원소로 가진 2차원 배열 commands가 매개변수로 주어질 때,
//commands의 모든 원소에 대해 앞서 설명한 연산을 적용했을 때 나온 결과를 배열에 담아 return 하도록 solution 함수를 작성해주세요.

public class D0410W6 {
	public static void main(String[] args) {
		
		int[] array = {1, 5, 2, 6, 3, 7, 4};
		int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
		
		System.out.println(Arrays.toString(solution(array, commands)));
		
	}
	
	public static int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for (int i = 0; i < commands.length; i++) {
            int start = commands[i][0] - 1; // 시작 인덱스
            int end = commands[i][1] - 1; // 끝 인덱스
            int k = commands[i][2] - 1; // k번째 수 인덱스

            int[] temp = new int[end - start + 1];
            int idx = 0;
            for (int j = start; j <= end; j++) {
                temp[idx++] = array[j];
            }

            Arrays.sort(temp);
            answer[i] = temp[k];
        }

        return answer;
    }
	
}

//public static void main(String[] args) {
//	Scanner sc = new Scanner(System.in);
//	
//	// step1. commands = {2, 5, 3} 
//
//	int[] array = { 1, 5, 2, 6, 3, 7, 4 };
//	int[] commands = { 2, 5, 3 };
//	
//	int answer = 0;
//
//	int[] temp = new int[commands[1] - (commands[0] - 1)]; // 5 - ( 2 - 1 ) = 4
//	for (int j = 0; j < temp.length; j++) {
//		temp[j] = array[j + (commands[0] - 1)]; // temp[0] <= array[0 + (2 - 1) ] <= array[1] == 5
//												// temp[1] <= array[1 + (2 - 1) ] <= array[2] == 2
//												// temp[2] <= array[2 + (2 - 1) ] <= array[3] == 6
//												// temp[3] <= array[3 + (2 - 1) ] <= array[4] == 3
//	}		
//	Arrays.sort(temp); // {2, 3, 5, 6}
//	answer = temp[commands[2] - 1]; // answer = temp[3 - 1] <= temp[2] 
//
//	System.out.println(answer); // 5 
//	
//	
//	// step2. commands = { 4, 4, 1 };
//	
//	int[] commands2 = { 4, 4, 1 };
//
//	int[] temp2 = new int[commands2[1] - (commands2[0] - 1)]; // 4 - ( 4 - 1 ) = 1 
//	for (int j = 0; j < temp.length; j++) {
//		temp[j] = array[j + (commands2[0] - 1)]; // temp[0] <= array[0 + (4 - 1) ] <= array[3] == 6
//	}		
//	Arrays.sort(temp); // {6}
//	answer = temp[commands2[2] - 1]; // answer = temp[1 - 1] <= temp[0] 
//
//	System.out.println(answer); // 6
//	
//
//}

