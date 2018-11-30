package learn.java8.lambda;

public class ThisReferenceExample {

	public static void doProcess(int i, Process p) {
		p.process(i);
	}
	
	
	public void execute() {
		doProcess(10, i -> {
			System.out.println("The value of i : " + i);
			 System.out.println(this);   //this refers to the instance of the class whom this methos is called on.
		});
	}
	
	public static void main(String[] args) {
		
		ThisReferenceExample thisReferenceExample = new ThisReferenceExample();
		
		/*thisReferenceExample.doProcess(10, new Process() {

			@Override
			public void process(int i) {
				System.out.println("The value of i : " + i);
				System.out.println(this); //this refers to the process instance
			}
		});*/
		
		/*thisReferenceExample.doProcess(10, i -> {
			System.out.println("The value of i : " + i);
			// System.out.println(this); // 'this' doesn't work here, because it refers to the static main
		});
		*/
		
		thisReferenceExample.execute();
	}
	
	public String toString() {
		return "This is the main ThisReferenceExample class instance.";
	}

}
