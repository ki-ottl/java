
public class practice7 {

	public static void main(String[] args) {

		for (int i=7 ; i<10 ; i++) {
			for (int j=1 ; j<10 ; j++) {
				if ((i*j)%2==0) {
					System.out.println(i+" X "+j+" = "+i*j+", 짝수입니다");
				} else {
					System.out.println(i+" X "+j+" = "+i*j+", 홀수입니다");
				}
			} System.out.println("-----------------------------------");
		}
	}
}


//7.  구구단을 7단부터 9단까지 출력하도록 만들어주세요.
//단, 7단과 8단과 9단사이에 구분을 짓는 구분선 "-----------------------------------"을 이용해 구분지어 주세요.
//추가로 결과값이 짝수이면, "짝수" 출력, 홀수이면 "홀수"를 출력해주세요.

