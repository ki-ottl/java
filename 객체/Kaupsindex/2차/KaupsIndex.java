import java.util.Scanner;

public class KaupsIndex {
	
	// �Է�
	public double inputWeight() {
		System.out.println("�����Ը� �Է����ּ��� (���� kg)");
		Scanner scanner = new Scanner(System.in);
		String inputString = scanner.nextLine();
		double weight = Double.parseDouble(inputString);
		return weight;
	}
	public double inputHeight() {
		System.out.println("Ű�� �Է����ּ��� (���� cm)");
		Scanner scanner = new Scanner(System.in);
		String inputString = scanner.nextLine();
		double height = Double.parseDouble(inputString);
		height = height / (double)100;
		return height;
	}
	
	// ī���� ���
	public void calcKaup(double weight, double height) {
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
