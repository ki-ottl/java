import java.util.ArrayList;

public class ClassRoom {
	String name;
	ArrayList<Student> innerStudents = new ArrayList<Student>();
	
	ClassRoom() {
		
	}
	
	ClassRoom(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return this.name + " (" + this.innerStudents.size() + "명)";
	}
}