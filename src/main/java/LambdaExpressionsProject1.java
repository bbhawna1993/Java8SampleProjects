import java.util.ArrayList;
import java.util.List;

public class LambdaExpressionsProject1 {

	public static void main(String[] args)
	{
		List<String> al=new ArrayList();
		al.add("string1");
		al.add("string2");
		al.add("string3");
		
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
