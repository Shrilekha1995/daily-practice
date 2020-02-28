package tester;

public class TestCurThread {

/*	@Override
	protected void finalize() throws Throwable {
		System.out.println("finalize called");
	}*/
	
	public void a() throws InterruptedException
	{
		wait();
		notify();
		
	}
	public static void main(String[] args) throws InterruptedException {
	/*	System.out.println(Thread.getAllStackTraces().keySet().size());
		for(Thread t: Thread.getAllStackTraces().keySet())
		{
			System.out.println(t.getName());
		}
		Thread.sleep(2000);
		TestCurThread t=new TestCurThread();
		t=null;
		System.out.println("Main Completes"); 
		Thread.sleep(2000);
		TestCurThread t2=new TestCurThread();
		int i=0;
		
	//	while
		t2=null;
		Thread.sleep(2000);
		 System.gc(); 
	        System.out.println("Main Completes"); */
	}
}
