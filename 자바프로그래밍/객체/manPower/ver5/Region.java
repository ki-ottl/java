
public class Region {
	String name;
	int count = 0;
	
	public void calcCount(People[] people) { // people 배열을 받아서 나와 같은 지역명을 가지고 있는 애가 있다면 카운트를 해달라
		for (int i = 0; i < people.length; i++) {
			if (people[i] == null) {
				continue;
			}
			if (people[i].address.equals(this.name)) {
				this.count++; // 나와 같은 주소를 가지고 있는 애를 카운트 해달라
			}
		}
		System.out.println(this.name + " 인구 수 : " + this.count);
	}
}

