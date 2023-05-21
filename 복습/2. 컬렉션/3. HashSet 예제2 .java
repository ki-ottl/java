import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Ex11_10 {
	public static void main(String[] args) {
		
		// 중복된 값은 저장되지 않는 HashSet의 성질을 이용해서 로또번호 만들기

		Set set = new HashSet();

		for (int i = 0; set.size() < 6; i++) {
			int num = (int) (Math.random() * 45) + 1;
			set.add((new Integer(num)));
//			set.add((num)); // 가능
		}
		
//		System.out.println(set); // Set은 순서를 유지하기 때문에 정렬 불가.
//		따라서 1. Set의 모든 요소를 List에 저장
//			 2. List를 정렬
//		     3. List를 출력
		
		List list = new LinkedList(set); // LinkedList(Collection c)
		Collections.sort(list); // Collection.sort(List list)
		System.out.println(list);

	}

}
