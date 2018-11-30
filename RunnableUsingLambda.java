package learn.java8.lambda;

public class RunnableUsingLambda {

/*Lambda expression is used for interface with only one function.
* 
*
*/
	public static void main(String[] args) {
		Thread myThread = new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("printed from Runnable");
			}
		});
		
		myThread.start();
		
		Thread myLambdaThread = new Thread(() -> System.out.println("printed from Lambda Runnable"));
		myLambdaThread.start();
	}

}
