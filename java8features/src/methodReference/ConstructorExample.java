package methodReference;

interface Messageable {

	Message getMessage();
}

class Message {

	Message() {
		System.out.println(" constructor executing");
	}
}

public class ConstructorExample {

	public static void main(String[] args) {

		Messageable ref = Message::new;
		ref.getMessage();

	}

}
