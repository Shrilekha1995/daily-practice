package methodReference;

public class InstanceMethodExample {

	public void saySomething() {
		System.out.println("this is instance method");
	}

	public static void main(String[] args) {

		InstanceMethodExample obj = new InstanceMethodExample();

		Sayable say1 = obj::saySomething;

		say1.say();

	}

}
