
package lambda;

// lambda expression is used for concise code.
//
@FunctionalInterface
interface Drawable {

	public void draw();

}

public class LambdaExample1 {

	public static void main(String[] args) {

		int width = 10;

		Drawable d2 = () -> {
			System.out.println("drawing " + width);
		};

		Drawable d3 = () -> {
			System.out.println("drawing d3 ");
		};

		d2.draw();
		d3.draw();

	}

}
