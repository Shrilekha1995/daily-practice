package lambda;

interface Draw {

	String draw();
}

public class LambdaExample2 {

	public static void main(String[] args) {

		Draw d = () -> {
			return "Hello";
		};

		System.out.println(d.draw());

	}

}
