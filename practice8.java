import java.util.Random;
import java.util.Scanner;

public class practice8 {

	public static void main(String[] args) {


		System.out.println("���ڸ� �Է����ּ���(0~100) :");
	
		Scanner s= new Scanner(System.in);
		int inputNum = s.nextInt();
		
		Random r = new Random();
		int randomNum = r.nextInt(10);
		
		// �и� 0�� ��츦 ����ó���ϰ� ������
		// 
		if (randomNum==0) {
			System.out.println("�ٽ� �õ����ּ���");
		}
		
		int divideNum = inputNum / randomNum;

		if (0>inputNum||inputNum>100) {
				System.out.println("���ڰ� Ů�ϴ�");
			} else {
				if (divideNum%2==1) {
					System.out.println("����� ���� "+inputNum+"���� ������ �� "+randomNum+"�� ���� ����"+divideNum+"�̰�, �ش� ���ڴ� Ȧ�� �Դϴ�.");
				}
				else {
					System.out.println("����� ���� "+inputNum+"���� ������ �� "+randomNum+"�� ���� ����"+divideNum+"�̰�, �ش� ���ڴ� ¦�� �Դϴ�.");
				}
			}

	}
}

//8. ����ڷκ��� 0~100 ������ ���ڸ� �Է� �޽��ϴ�.
//�Է¹��� ���ڿ� 1~10 ������ ������ ������ ������ �ݴϴ�.
//���� ���� ¦������ Ȧ������ ����� ���ּ���.
//��, ����ڷκ��� �Է¹��� ���ڰ� 0���� �۰ų� 100���� Ŭ���� "���ڰ� Ů�ϴ�"�� ����ϵ��� �ۼ����ּ���


