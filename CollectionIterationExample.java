package learn.java8.lambda;

import java.util.Arrays;
import java.util.List;

public class CollectionIterationExample {
/* new way of iterating collection using lambda expression
 *  forEach (Consumer<> action)
 */
	
	public static void main(String[] args) {
		List<Person> people = Arrays.asList(
				new Person("Charles", "Dickens", 60),
				new Person("Lewis", "Carroll", 42),
				new Person("Thomas", "Carlyle", 51),
				new Person("Charlotte", "Bronte", 45),
				new Person("Matthew", "Arnold", 39)
				);
		
		people.forEach(p -> System.out.println(p));
       
		// also works like this
		people.forEach(System.out::println);
		
	}
	

}
