package tester;

public class DeadLockPractice implements Runnable {

	@Override
	public void run() {
		
		if(Thread.currentThread().getName().equals("t1")){
			f1();
		}
		else{
			f2();
		}
	}

	private void f2() {
		
		synchronized(Integer.class){
			System.out.println("Integer class acquired by f2()");
			synchronized(String.class){
				System.out.println("String class acquired by f2()");
			}
		}
		
		
		
	}

	private void f1() {
		synchronized(String.class){
			System.out.println("String class acquired by f1()");
			
			synchronized(Integer.class){
				System.out.println("Integer class acquired by f1()");
			}
		}
		
		
	}

	public static void main(String[] args) {
		DeadLockPractice d=new DeadLockPractice();
		Thread t1=new Thread(d,"t1");
		Thread t2=new Thread(d,"t2");
		t1.start();
		t2.start();
	}

}
