package defaultMethod;

/* We can add methods in interface without creating problem for concrete classes which are 
  implementing the same  interface ..so concrete classes won't need to implement additional methods 
  which are added in interface */

interface Shape {

	void draw();

	default void fill() {
		System.out.println("you are in fill method of interface");
	}
}

public class Circle implements Shape {

//	@Override
//	public void fill() {
//		System.out.println("you are in fill method of class");
//	}

	public static void main(String[] args) {

		Circle c1 = new Circle();
		c1.fill();

	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub

	}

}
