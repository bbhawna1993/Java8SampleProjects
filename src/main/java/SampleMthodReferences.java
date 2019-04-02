import java.util.ArrayList;
import java.util.List;

public class SampleMthodReferences {

	public static void main(String[] args) {
		
		List<String> al=new ArrayList();
		al.add("bhawna1");
		al.add("bhawna2");
		al.add("bhawna3");
		al.add("bhawna4");
		/*enhanced for each loop.This defines the method accept() present in
		onsumer interface which takes one string type argument and prints that using 
		lambda expressions.*/
		
		/*
		 * This can be more modified using method reference where in we need not define 
		 *
		 * any method and print that using System.out::println.
		 */
		//al.forEach((String)->System.out.println(String));
		al.forEach(System.out::println);
	}

}
