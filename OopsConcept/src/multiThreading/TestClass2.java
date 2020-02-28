package multiThreading;

public class TestClass2  {

	public static void main(String[] args) {
		
		MyThread target1=new MyThread();
		Thread t1=new Thread(target1,"Thread one");
		t1.start();
		
		Thread t2=new Thread(target1,"Thread two");
		t2.start();
		
		

	}

}
