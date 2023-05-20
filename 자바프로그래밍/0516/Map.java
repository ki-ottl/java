import java.util.HashMap;

public class Map {
	
	public static void main(String[] args) {
		
		HashMap<String, String> t = new HashMap<String, String>();
		t.put("abc", "-----------");
		t.put("tt", "***************");
		
		System.out.println(t.get("abc"));
			
	}
}
