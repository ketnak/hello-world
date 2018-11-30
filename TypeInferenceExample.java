package learn.java8.lambda;

/* Type Inference is a Java compiler's ability to look at each method invocation 
*  and corresponding declaration to determine the type argument(s) that make
*  the invocation applicable.
*/ 

public class TypeInferenceExample {

	public static void main(String[] args) {
		printLambda(s -> s.length());
		
     /* StringLengthLambda myLambda = s -> s.length();
		System.out.println(myLambda.getLength("Hello Lambda"));  //12
     */
	}
	
	public static void printLambda(StringLengthLambda l) {
		System.out.println(l.getLength("Hello Lambda"));
	}

	interface StringLengthLambda {
		int getLength(String s);
	}
}


