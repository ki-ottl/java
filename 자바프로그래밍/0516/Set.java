import java.util.HashSet;

public class Set {
	public static void main(String[] args) {
		
		HashSet<String> t = new HashSet<String>();
		t.add("1");
		t.add("2");
		t.add("3");
		t.add("1");
		t.add("1");
		t.add("1");
		t.add("1");
		t.add("1");
		t.add("1");
		t.add("10");
		
		System.out.println(t);
		 
	}
}
