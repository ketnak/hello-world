package learn.java8.lambda;

import java.util.function.BiConsumer;

public class ExceptionHandlingInLambda {

	public static void main(String[] args) {
		int[] someNo = {1, 2, 3, 4};
		int key = 2;
		process(someNo, key, wrapperLambda((v, k) -> System.out.println(v / k)));

	}
	
	public static void process(int[] someNo, int key, BiConsumer<Integer, Integer> consumer) {
		for(int i : someNo) {
			consumer.accept(i, key);
		}
	}
	
	// by creating  wrapperLambda u can handle the exception. Also you can create Generic type instead of Integer.
	private static BiConsumer<Integer, Integer> wrapperLambda(BiConsumer<Integer, Integer> consumer){
		return (v, k) -> {
			try {
				consumer.accept(v, k);
			}catch(ArithmeticException e) {
				System.out.println("Exception Caught in wrapper lambda");
			}
		};
	}

}
