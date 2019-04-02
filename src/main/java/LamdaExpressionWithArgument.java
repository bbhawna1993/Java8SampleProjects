public class LamdaExpressionWithArgument {

	public static void main(String[] args) {
		/*this defines a lambda expression.we have a functional interface MyInterface1
	and we are defining the method1 using lambda expression.It contains one method.
		 This is the definition of method1 which takes one string type argument.
		 */
		MyInterface1 myInterface1=(name)->{
			System.out.println("name="+name);
		};
		//calling the mthod1 by passing one string argument.
		myInterface1.method1("bhawna1");	
		
		//--------------------------------------------------------------------
		
		MyInterface2 myInterface2=(name,rollno)->{
			System.out.println("name="+name+","+"rollno="+rollno);
		};
		
		myInterface2.method2("name2",10);
	}

}
