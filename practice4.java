import java.util.Scanner;

public class practice4 {

	public static void main(String[] args) {
		
		System.out.println("�����Է�:");
		
		Scanner s= new Scanner(System.in);
		
		int inputNum = s.nextInt();
		
		if (inputNum<21) {
			for (int i=inputNum ; i <= 20 ; i++) {
				System.out.println(7+" X "+i+" = "+7*i);
				}
		} else { 
			System.out.println("ERROR");
			}

	}

}

//4. <��ȭ����> ����ڷκ��� �Է¹��� ���ں��� 20���� ���ϴ� ������ 7���� �ۼ����ּ���.
//����1> ����ڷκ��� �Է¹��� ���ڰ� 21�̻��̸� "ERROR"��� ǥ���Ѵ�.
//���)
