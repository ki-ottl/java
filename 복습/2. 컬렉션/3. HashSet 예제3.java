import  java.util.*;

public class Ex11_11 {
	
	public static void main(String[] args) {
		// HashSet은 순서X, 중복X
		// 따라서 객체를 저장하기 전에 기존에 같은 객체가 있는지 확인한다.
		// 같은 객체가 없으면 저장하고, 있으면 저장하지 않는다.
		// boolean add(Object o)는 저장할 객체의 equals()와 hashCode()를 호출하여 중복 확인.
		// 따라서 equals()와 hashCode()가 오버라이딩 되어 있어야 한다.
		
		HashSet set = new HashSet();
		set.add("abc");
		set.add("abc"); // 중복이라 저장안됨.
		set.add(new Person("David", 10));
		set.add(new Person("David", 10));
		
		System.out.println(set); // equals()와 hashCode()를 Override 하지 않으면,
								 // 출력값은 [abc, David:10, David:10]
	}
}

// equals()와 hashCode()를 오버라이딩해야 HashSet이 바르게 동작. 
// cf) Source > Generate hashCode() and equals()...
class Person {
	String name;
	int age;
	
	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return name + ":" + age;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Person)) {
			return false;
		}
		Person p = (Person)obj; // 형변환을 해줘야, 
								// 나자신(this)와 매개변수로 지정된 객체인 obj를 비교할 수 있다. 
		return this.name.equals(p.name) && this.age==p.age; // obj.name, obj.age를 비교하면 에러.
														    // object 객체에는 name, age라는 멤버가 없기 때문.
	}
	
	@Override
	public int hashCode() {
//		return (name+age).hashCode(); // 예전 방식
		return Objects.hash(name, age);// 객체를 구분하는 기준이 iv이기 때문. 
	}
}
