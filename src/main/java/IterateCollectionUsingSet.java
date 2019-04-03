import java.util.HashSet;
import java.util.Set;

public class IterateCollectionUsingSet {

	public static void main(String[] args) {
		Set<Student> hs=new HashSet<>();
		hs.add(new Student(1,"name1","email1"));
		hs.add(new Student(2,"name2","email2"));
		hs.add(new Student(3,"name3","email3"));
		hs.add(new Student(4,"name4","email4"));
		

		hs.forEach(System.out::println);
	}

}
