import java.util.*;

public class Main {
	public static void main(String[] args) {
		List<Student> list = Arrays.asList(
			    new Student(3, "John"),
			    new Student(1, "Alice"),
			    new Student(2, "Bob")
			);
		Collections.sort(list);
		for(Student a:list) {
			System.out.println(a.name);
		}

	}

}
