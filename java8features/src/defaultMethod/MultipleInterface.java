package defaultMethod;

/*
 * If class implementing 2 intefaces and both the interfaces has default method.
   compiler will generate error ..you need to override default method.
 * 
 * 
 * 
 */

interface Colour {

	default void fill() {
		System.out.println("you are in fill method of colour inteface ");
	}
}

public class MultipleInterface implements Shape, Colour {

	public static void main(String[] args) {
		MultipleInterface m1 = new MultipleInterface();
		m1.fill();

	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub

	}

	@Override
	public void fill() {
		
		Colour.super.fill();
	}


}
