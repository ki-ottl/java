import java.util.HashMap;

public class Ex11_15 {

	public static void main(String[] args) {
		
		// HashMap : 데이터를 키와 값의 쌍으로 저장
		// 순서X, 중복(키X, 값O) cf) 순서를 유지하려면 LinkedHashMap 클래스 사용
		
		HashMap map = new HashMap();
		map.put("myid", "1234");
		map.put("asdf", "1111");
		map.put("asdf", "1234"); // OK. 이미 존재하는 키 추가가능. 기존 값은 없어진다.
		
		System.out.println(map);

	}

}
