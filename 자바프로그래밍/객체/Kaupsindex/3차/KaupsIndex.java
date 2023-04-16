import java.util.Scanner;

public class KaupsIndex {
	double weight = 0;
	double height = 0;
	
	// �Է�
	public void inputVar() {
		System.out.println("�����Ը� �Է����ּ��� (���� kg)");
		Scanner scanner = new Scanner(System.in);
		String inputString = scanner.nextLine();
		weight = Double.parseDouble(inputString);

		System.out.println("Ű�� �Է����ּ��� (���� cm)");
		inputString = scanner.nextLine();
		height = Double.parseDouble(inputString);
		height = height / (double)100;
	}
	
	// ī���� ���
	public void calcKaup() {
		double result = (double)weight / (height * height);
		
		if (result >= 30) {
			System.out.println("��");
		} else if (result > 24) {
			System.out.println("��ü��");
		} else if (result > 20) {
			System.out.println("����");
		} else if (result > 15) {
			System.out.println("��ü��");
		} else if (result > 13) {
			System.out.println("����");
		} else if (result > 10) {
			System.out.println("���� ������");
		} else {
			System.out.println("�Ҹ���");
		}
	}
}
