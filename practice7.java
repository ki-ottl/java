
public class practice7 {

	public static void main(String[] args) {

		for (int i=7 ; i<10 ; i++) {
			for (int j=1 ; j<10 ; j++) {
				if ((i*j)%2==0) {
					System.out.println(i+" X "+j+" = "+i*j+", ¦���Դϴ�");
				} else {
					System.out.println(i+" X "+j+" = "+i*j+", Ȧ���Դϴ�");
				}
			} System.out.println("-----------------------------------");
		}
	}
}
