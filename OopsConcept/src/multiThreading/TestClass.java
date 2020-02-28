package multiThreading;

public class TestClass extends Thread {
	
	static int count=0;

	public TestClass() {
		System.out.println(getName() + " " + getState());
	}

	public void run() {
        for(int i=0;i<50;i++)
		System.out.println(count++);
		
	}

	public static void main(String[] args) throws InterruptedException {

	/*	System.out.println(Thread.currentThread().getName());

		TestClass t1 = new TestClass();
		t1.start();
		t1.join();
		//for(int i=0;i<50;i++)
		System.out.println(t1.getName() + " " + t1.getState());*/
		
		TestClass t1 = new TestClass();
		
		t1.start();
		for(int i=1000;i<1500;i++)
			System.out.println(i);
		

	}

}
