package learn.java8.lambda;

import java.util.function.BiFunction;

public class MethodReferences {
 /* Method Reference is used to refer method of functional interface. 
  * It is compact and easy form of lambda expression.
  *  1. Reference to a static method
  *  2. Reference to an instance method
  *  3. Reference to a Constructor
  */
	public static void main(String[] args) {
		//This is static method reference in Lambda example.
		Thread t = new Thread(MethodReferences::printMessage);
		t.start();
		Sayable sayable = MethodReferences::saySomething;
		sayable.say();
		
		//predefined functional interface to refer methods.
		BiFunction<Integer, Integer, Integer> adder = Arithmetic::add;
		System.out.println("BiFunction add: " + adder.apply(10,20));
		
		//also can override static methods by referring methods.
		BiFunction<Integer, Float, Float> adderIntFloat = Arithmetic::add;
		System.out.println("BiFunction add: " + adderIntFloat.apply(10, 20.0f));
		BiFunction<Float, Float, Float> adderFloat = Arithmetic::add;
		System.out.println("BiFunction add: " + adderFloat.apply(10.0f, 20.0f));
		
		//also refer by class object(line 13) and anonymous object
		Sayable sayableInstance = new MethodReferences()::sayInstance;
		sayableInstance.say();
		
	}

	
	public static void printMessage() {
		System.out.println("Hi");
	}
	
	public static void saySomething() {
		System.out.println("This is static method.");
	}
	
	public void sayInstance() {
		System.out.println("This is instance method.");
	}
}

interface Sayable{
	void say();
}

class Arithmetic{
	public static int add(int a, int b) {
		return a+b;
	}
	
	public static float add(int a, float b) {
		return a+b;
	}
	
	public static float add(float a, float b) {
		return a+b;
	}
}


