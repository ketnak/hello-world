package learn.java8.lambda;

public class MethodReferenceToConstructor {

	public static void main(String[] args) {
		Messageable hello = Message::new;
        hello.getMessage("Hello");
	}

}


interface Messageable {
	Message getMessage(String msg);
}

class Message {
	Message(String msg){
		System.out.println(msg);
	}
}