@FunctionalInterface
public interface SampleInterface {

	//abstract method specific to SampleInterface which is a functional interface
	void method1();

	//abstract method specific to Object class
	public boolean equals(Object obj);

	//abstract method specific to Object class
	public int hashCode();
}
