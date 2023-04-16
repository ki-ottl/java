public class MainClass {
	public static void main(String[] args) {
		Manager manager = new Manager();
		for (int i = 0; i < 99999; i++) {
			boolean result = manager.showMenu();
			if (!result) {
				break;
			}
		}
		
	}
}
