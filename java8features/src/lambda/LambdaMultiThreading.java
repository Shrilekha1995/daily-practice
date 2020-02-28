package lambda;

public class LambdaMultiThreading {

	public static void main(String[] args) {

		Runnable runnable1 = () -> System.out.println("Thread is running");
		Thread thread1 = new Thread(runnable1);
		thread1.start();

	}

}
