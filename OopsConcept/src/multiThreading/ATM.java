package multiThreading;

import java.util.Set;

public class ATM {

	public static void main(String[] args) {
		
		Set<Thread> threadSet = Thread.getAllStackTraces().keySet();
		
		System.out.println(threadSet);
		Account target1=new Account(10000);
		Thread t1=new Thread(target1,"husband");
		Thread t2=new Thread(target1,"wife");
		//t1.start();
		//t2.start();

	}

}
