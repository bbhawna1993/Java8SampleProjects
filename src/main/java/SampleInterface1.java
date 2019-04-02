
/*Here it does not gives error because it is extending a functional interface
 which already contains an abstract method which is inherited so it is also a functional
 interface
 */
@FunctionalInterface
public interface SampleInterface1 extends SampleInterface{

	/*Now this interface contains one abstract method and one default method
	 * still it is termed as Functional Interface.
	 */
	public default void method2() {
	}
	
	/* Adding any number of default method will not hamper the contract of 
	 * functional interface.
	 */
	public default void method4() {
	}

	/*Adding any number of static method will not hamper the contract of 
	 * functional interface.
	 */
	public static void method3() {
	}

}
