import java.util.Arrays;

public class Quiz1 {

	public static void main(String[] args) {
		
		// ������ ���Ͽ� ���� ������� ��� 
		// 1�� : E(270)
		// 2�� : D(255)
		// 3�� : C(240)
		// 4�� : B(210)
		// 5�� : A(155)
		
		String[] name  = {"A", "B", "C", "D", "E"};
		
		int[] kor = {50, 60, 70, 80, 90};
		int[] eng = {10, 70, 80, 90, 100};
		int[] math = {95, 80, 90, 85, 80};
		
		int[] total = new int[name.length];
		
		for(int i=0; i<name.length;i++) {
			total[i] = kor[i]+eng[i]+math[i];
		}
		
		int[] sort = new int[name.length];
		
		for(int i=0; i<name.length;i++) {
			sort[i] = total[i];
		}
		
		Arrays.sort(sort);
		
		int tmp;
		String tmpForName;

		
		for(int i = 0 ; i<sort.length ; i++) {
			for (int j = 0; j < total.length; j++) {
				if (sort[i]>sort[j]) {
					tmp = sort[i];
					sort[i] = sort[j];
					sort[j] = tmp;
					tmpForName = name[i];
					name[i] = name[j];
					name[j] = tmpForName;
				}
			}
		}
		
		
		for (int i = 0 ; i < name.length ; i++) {
			System.out.println((i+1)+"�� : "+name[i]+"("+sort[i]+")");
		}

	}

}
