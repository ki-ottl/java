class MyPoint3 extends Object { 
	int x;
	int y;
	
	MyPoint3(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	@Override 
	public String toString() {
		return "x:"+x+", y:"+y;
	} // Object클래스의 toString()을 오버라이딩
}


public class OverrideTest {
	public static void main(String[] args) {
		
		MyPoint3 p = new MyPoint3(3,5); // 한번에 초기화
		// p.x = 3;
		// p.y = 5;

		System.out.println(p); // 출력
	    // System.out.println(p.toString());
		// System.out.println("x:"+p.x+", y:"+p.y);
	
	}

}
