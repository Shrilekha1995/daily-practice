package methodReference;

interface Sayable {

	void say();

}

public class StaticMethodExample {

	public static void saySomething() {
		System.out.println("this is static method");
	}

	public static void main(String[] args) {

		Sayable say1 = StaticMethodExample::saySomething;// interface should be functional interface
        say1.say();

	}

}
