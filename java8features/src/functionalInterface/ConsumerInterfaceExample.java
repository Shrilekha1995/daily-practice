package functionalInterface;

import java.util.function.Consumer;

public class ConsumerInterfaceExample {

	public static void printValue(int value) {
		System.out.println(value);
	}

	public static void printString(String str) {
		System.out.println(str.toUpperCase());

	}

	public static void main(String[] args) {

		Consumer<Integer> cref = ConsumerInterfaceExample::printValue;
		cref.accept(16);

		Consumer<String> cref2 = ConsumerInterfaceExample::printString;
		cref2.accept("shri");
	}

}
