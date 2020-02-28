package stasticMethods;

/*
 * Static methods are same as default methods but only difference is it 
   can not be overridden at class level.
 * Static methods are only visible at interface level means we can not call static method 
   using object of class
   it allows security
   * we can not override object classs methods
 */
interface Drawable {

	static void sayHello() {

		System.out.println("in static method of Drawable");

	}
}

interface Sayable {

	void say();

	default void saySomething() {
		System.out.println("In  default method");
	}

	static void sayHello() {
		System.out.println("in static method");
	}

	default void draw() {

		System.out.println("in draw method ");
	}
}

public class staticMethodExample implements Sayable, Drawable {

	public static void main(String[] args) {

		staticMethodExample obj = new staticMethodExample();

		obj.say();
		Sayable.sayHello();

	}

	@Override
	public void say() {
		System.out.println("In say method");

	}

}
