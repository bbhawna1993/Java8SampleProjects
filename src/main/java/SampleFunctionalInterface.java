public class SampleFunctionalInterface {

	public static void main(String[] args) {

		/*Runnable is an example of functional interface.Functional interface contains only 
one abstract method.Here we provide the definition of 
run method using lambda expressions.Lambda expressions will be discovered in 
next tutorials.*/

		Runnable r=()->
		{
			System.out.println("inside runnable");
		};
		Thread thread=new Thread(r);
		thread.start();
	}
}






