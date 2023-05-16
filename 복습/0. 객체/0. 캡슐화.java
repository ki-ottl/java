class Time {
	private int hour; // 0~23 사이의 값을 가져야 함.
	private int minute;
	private int second;

	public void setHour(int hour) {
		if (hour < 0 || hour > 23)
			return;

		this.hour = hour;
	}

	public int getHour() {
		return hour;
	};

}

public class Ex {
	public static void main(String[] args) {

		Time t = new Time();
//		t.hour = -100; // 직접 접근 불가
		t.setHour(21); // hour의 값을 21로 변경
		System.out.println(t.getHour()); // 21 출력
		t.setHour(100); // 유효한 값이 아니기 때문에 변경되지 않음
		System.out.println(t.getHour()); // 21 출력

	}
}
