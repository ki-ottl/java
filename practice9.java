import java.util.Scanner;

public class practice9 {

	public static void main(String[] args) {
		
		
		System.out.println("���ڸ� �Է����ּ��� :");
		
		Scanner s= new Scanner(System.in);
		int userNum = s.nextInt();

		for (int i = 0 ; i < 9 ; i++) {
			System.out.println("�Է��Ͻ� ���� "+userNum+"�� 3���� ���� ���� "+(userNum-=3)+" �Դϴ�");
		}

	}
}

// �ִ��� ����غ��Ҵµ� ��°��� �޶� ���� ã�� ���ߴ�.
// ù ��° �� ĭ : int i = 0 ; i < 9 ; i++
// �� ��° �� ĭ: userNum
// �� ��° �� ĭ : userNum-=3