import java.util.Random;
import java.util.Scanner;

public class practice5 {

	public static void main(String[] args) {
		
		System.out.println("�������ڳ��̰���");
		System.out.println("0~100������ ���ڸ� �Է����ּ���");
		System.out.println("�Է� :");
	
		Scanner s= new Scanner(System.in);
		int inputNum = s.nextInt();
		
		Random r = new Random();
		int randomNum = r.nextInt(100);
		
		// ��Ģ2�� ������ �𸣰ھ ��õ� �޽����� ��ü�Ͽ����ϴ٤Ф�
		if (randomNum == inputNum) {
			System.out.println("�ٽ� �õ����ּ���");
		} else {
			if (0>inputNum||inputNum>100) {
				System.out.println("0~100������ ���ڰ� �ƴմϴ�");
			} else {
			System.out.println("����� �Է¼��ڴ� "+inputNum+"������Է¼���+�������ڴ�"+(inputNum+randomNum)+", ��ǻ�� �¸��Դϴ�");
			}

	}

}
}


//5. �������ڳ��̰����� �����ô�. ��Ģ�� ������ �����ϴ�.
//��Ģ1) ����ڷκ��� �Է¹��� ���ڿ� ������ ���� ���� �߰���Ų��.
//��Ģ2) ��ǻ�ʹ� ������ ���ڸ� �߻���Ű��, �ش� ���ڿ� ������ ����ڿ��� �߰��� ������ ���� �ٸ� �����ǰ��� �߰���Ų��.
//��Ģ3) ����ڰ� 0~100 �� ������ ���ڸ� �Է��� ��� "0~100������ ���ڰ� �ƴմϴ�." �޼����� ����Ѵ�.




