package threadPractice;

public class Tester {

	public static void main(String[] args) {
		
		MyThread t1=new MyThread();
		t1.setName("t1");
		MyThread t2=new MyThread();
		t1.start();
		t2.start();
		try {
			
			t1.join();
			System.out.println("after t1 join");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	
		
		
		

	}

}
