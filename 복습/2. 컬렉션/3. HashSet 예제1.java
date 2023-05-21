import java.util.*;

public class Ex11_9 {

	public static void main(String[] args) {

		// Set : 순서 유지 X, 중복 허용 X

		Object[] objArr = { "1", new Integer(1), "2", "2", "3", "3", "4", "4", "4" };
		Set set = new HashSet();

		for (int i = 0; i < objArr.length; i++) {
			set.add(objArr[i]); // HashSet에 objArr의 요소들을 저장한다.
//			System.out.println(objArr[i]+"="+set.add(objArr[i])); // 저장 여부 확인 가능하다.
		}
		// HashSet에 저장된 요소들을 출력한다.
		System.out.println(set);

		// HashSet에 저장된 요소들을 출력한다. (Iterator 이용)
		Iterator it = set.iterator();

		while (it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
