package threadPractice;

public class MyThread extends Thread {
	
	public void run(){
		try
		{
		for(int i=1;i<11;i++)
		System.out.println(i+" "+Thread.currentThread().getName());
		}finally{
			if(Thread.currentThread().getName().equals("t1"))
			System.out.println("t1 over");
		}
		
	}

}
