package synchro;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MySynch extends Thread {
	Lock lock;
	Condition c;
	public MySynch() {
		// TODO Auto-generated constructor stub
		lock = new ReentrantLock();
		c=lock.newCondition();
		
		
	}

	 void display() throws InterruptedException {
		 lock.lock();
		System.out.println(Thread.currentThread().getName());
			for (int i = 1; i <= 10; i++) {
				System.out.println(i);
				if (i==5&&Thread.currentThread().getName().equals("two")) {
					//wait();
					c.await();
				}
			}
			/*notify();*/
			c.signal();
			lock.unlock();
			
		}
	
	@Override
	public void run() {
		try {
			display();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		
	}

