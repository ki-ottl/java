import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Ex11_6 {

	public static void main(String[] args) {

		ArrayList list = new ArrayList();
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");
		
//		// cf) 변경에 유연한 코드를 만든다면
//		Collection c = new ArrayList(); // Set으로도 변경 가능. (Collection의 자손이기 때문)
//		c.add("1"); c.add("2"); c.add("3"); 

		Iterator it = list.iterator();
		while(it.hasNext()) { 
			Object obj = it.next();
			System.out.println(obj);
		}

//		iterator는 1회용이기 때문에 다 쓰고나면 다시 얻어와야 한다.
//		it = list.iterator(); // 새로운 Iterator 객체를 얻는다.
//		while(it.hasNext()) {
//			Object obj = it.next();
//			System.out.println(obj);
//		}
		
//		for(int i = 0 ; i < list.size() ; i++) {
//		Object obj = list.get(i);
//		System.out.println(obj);
//	}
//	cf) list에서는 사용 가능하지만, set에서는 get() 메서드가 없기 때문에 동작 불가.
//		Iterator는 표준화 되어있기 때문에 List든, Set이든 모두 사용 가능하다.

	}

}
