
public class Quiz5 {

	public static void main(String[] args) {

//		길이가 n이고, "코포코포코포코포...."와 같은 패턴을 유지하는 문자열을 리턴하는 함수를 완성하세요.
//		예를들어 n이 5이면 "코포코포코"을 리턴하고 2이라면 "코포"를 리턴하면 됩니다. (2<=n<=100000)
//		class Solution {
//		    public String solution(int n) {
//		        String answer = "";
//		        return answer;
//		    }
//		}

		System.out.println(solution(5));

	}

	public static String solution(int n) {

		String answer = "";

		for (int i = 0; i < n; i++) {

			if (i % 2 == 0) {
				answer = answer + "코";
			}

			else {
				answer = answer + "포";
			}
		}

		return answer;
	}

}

