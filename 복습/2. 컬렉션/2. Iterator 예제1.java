import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class Ex11_5 {

	public static void main(String[] args) {
		// Iterator
		// 컬렉션에 저장된 데이터를 읽어오는 것에 사용되는 인터페이스
		// boolean hasNext() : 읽어 올 요소가 남아있는지 확인한다. 있으면 true, 없으면 false 반환.
		// Object next() : 다음 요소를 읽어 온다. next()를 호출하기 전에 hasNext()를 호출해서
		// 읽어올 요소가 있는지 확인하는 것이 안전하다.

		List list = new ArrayList();
		list.add(1);
		list.add(2);

		Iterator it = list.iterator();
		// 컬렉션에 iterator()를 호출해서 Iterator를 구현한 객체를 얻어서 사용한다.

		while (it.hasNext()) { // 읽어 올 요소가 있는지 확인
			System.out.println(it.next()); // 요소를 읽어오기
		}

	}

}
