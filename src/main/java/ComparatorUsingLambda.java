import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparatorUsingLambda {

	public static void main(String[] args) {

		List<Employee> hl=new ArrayList();

		hl.add(new Employee(1,"bhawna1"));
		hl.add(new Employee(2,"aaa"));
		hl.add(new Employee(3,"vvv"));
		hl.add(new Employee(4,"nnn"));
		hl.add(new Employee(5,"llll"));

		hl.forEach(System.out::println);

		Collections.sort(hl,(e1,e2)->e1.getEname().compareTo(e2.getEname()));
		System.out.println("---sorted employee list------");

		hl.forEach(System.out::println);
	}
}
