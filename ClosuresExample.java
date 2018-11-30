package learn.java8.lambda;

public class ClosuresExample {
 /*from java8, no need to declare final variable inside the method,
*  they are effectively final.
*/
	public static void main(String[] args) {
		int a = 10;
		int b = 20; //this is effectively final , can't change value of b.
		doProcess(a, i -> System.out.println(i+b));  //b is in closure, lambda has access to it. 

	}
	
	public static void doProcess(int i, Process p) {
		p.process(i);
	}

}

interface Process{
	void process(int i);
}