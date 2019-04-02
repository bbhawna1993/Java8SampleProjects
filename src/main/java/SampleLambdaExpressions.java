public class SampleLambdaExpressions {

	public static void main(String[] args) {
		
	 	Runnable r=()->{
	 		System.out.println("inside runnable.....");
	 	};
		
	 	Thread thread=new Thread(r);
	 	thread.start();
	}

}
