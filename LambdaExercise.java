package learn.java8.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
/*java.util.function package has many functions that has 
*only one method and can be used as lambda. java.util.function has many functional interfaces that can be used.
* i.e Supplier has get(), which doesnt take a ny input, but returns type T.
* i.e Function has apply(T) , takes in one type and return another type.
* I.e Consumer, BiConsumer, BiFunction interfaces are in 
*/
public class LambdaExercise {

	public static void main(String[] args) {
		List<Person> people = Arrays.asList(
				new Person("Charles", "Dickens", 60),
				new Person("Lewis", "Carroll", 42),
				new Person("Thomas", "Carlyle", 51),
				new Person("Charlotte", "Bronte", 45),
				new Person("Matthew", "Arnold", 39)
				);

		
		//Step 1: Sort list by last name
		Collections.sort(people, (p1, p2) -> p1.getLastName().compareTo(p2.getLastName()));
	
		
		//step 2: Create a method that prints all elements in the list
		System.out.println("Printing all people in the list:");
		printConditionally(people, p -> true);
		
		//step3: Create a method that prints all people that have
		// last name begin with 'C'
		System.out.println("Printing all people that have last name begin with C:");
		printConditionally(people, p -> p.getLastName().startsWith("C"));
		
		
		System.out.println("Printing all people that have first name begin with C:");
		printConditionally(people, p -> p.getFirstName().startsWith("C"));
		
	}
	
	/*private static void printAll(List<Person> people) {
		for(Person p : people) {
			System.out.println(p);
		}
	}*/
	
	private static void printConditionally(List<Person> people, Predicate<Person> predicate) {
		for(Person p : people) {
			if(predicate.test(p)) {
				System.out.println(p);
			}
		}
	}

	
}


