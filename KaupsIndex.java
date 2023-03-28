
public class KaupsIndex {

	public void index(double weight, double height) {
		
		double index;
		index = ( weight / (height*height)* 10000); 
		
		if (30 <= index) {
			System.out.println("당신은 지수는 "+index+"로 비만입니다.");
		} else if (24 <= index && index <= 29) {
			System.out.println("당신은 지수는 "+index+"로 과체중입니다.");
		} else if (20 <= index && index < 24) {
			System.out.println("당신은 지수는 "+index+"로 정상입니다.");
		} else if (15 <= index && index < 20) {
			System.out.println("당신은 지수는 "+index+"로 저체중입니다.");
		} else if (13 <= index && index < 15) {
			System.out.println("당신은 지수는 "+index+"로 여윔입니다.");
		} else if (10 <= index && index < 13) {
			System.out.println("당신은 지수는 "+index+"로 영양 실조증입니다.");
		} else {
			System.out.println("당신은 지수는 "+index+"로 소모증입니다.");
		}
	}
	
}