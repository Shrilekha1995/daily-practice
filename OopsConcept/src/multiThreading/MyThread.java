package multiThreading;

public class MyThread implements Runnable {

	@Override
	public void run() {
		
		printNum();
	}

	synchronized private void printNum() {
		for(int i=0;i<5;i++)
			System.out.println(i+" "+Thread.currentThread().getName());

		
	}

}
