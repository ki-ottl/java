public class Test {
	
	public static void main(String[] args) {
		// ������ ���Ͽ� ���� ������� ���
		// 1�� : E(270)
		// 2�� : D(255)
		// 3�� : C(240)
		// 4�� : B(210)
		// 5�� : A(155)

		String[] name = { "A", "B", "C", "D", "E" };

		int[] kor = { 50, 60, 70, 80, 90 };
		int[] eng = { 10, 70, 80, 90, 100 };
		int[] math = { 95, 80, 90, 85, 80 };
		
		int[] total = new int[name.length];
		
		for(int i = 0 ; i < total.length ; i++) {
			total[i] = kor[i]+eng[i]+math[i];
		}
		
		int[] sort = new int[total.length];
		
		for(int i = 0 ; i < sort.length ; i++) {
			sort[i] = total[i];
		}
		
		
		for (int i = 0 ; i < sort.length ; i++) {
			for (int j = i+1 ; j < sort.length ; j++) {
				if (sort[i]<sort[j]) {
					int tmp = sort[i];
					sort[i] = sort[j];
					sort[j] = tmp;
					String tmpName = name[i];
					name[i] = name[j];
					name[j] = tmpName;
				}
			}
		}
		
		for (int i = 0 ; i < name.length; i++) {
			System.out.println((i+1)+"�� : "+name[i]+"("+sort[i]+")");
		}
		
	}

}