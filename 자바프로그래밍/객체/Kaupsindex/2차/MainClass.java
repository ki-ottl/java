
public class MainClass {

	public static void main(String[] args) {
		KaupsIndex kaupsIndex = new KaupsIndex();
		
		double w = kaupsIndex.inputWeight();
		double h = kaupsIndex.inputHeight();
		kaupsIndex.calcKaup(w, h);
	}
}