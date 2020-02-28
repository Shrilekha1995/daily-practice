package tester;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;


class Thread3 extends Thread{
	LockProducerConsumer lockProducerConsumer;
	public Thread3(LockProducerConsumer lockProducerConsumer) {
		// TODO Auto-generated constructor stub
		this.lockProducerConsumer=lockProducerConsumer;
	}
	public void run(){
		for(int i=0;i<=15;i++){
		try {
			System.out.println("In Producer"+i);
			lockProducerConsumer.produce();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	}
}

class Thread4 extends Thread{
	LockProducerConsumer lockProducerConsumer;
	public Thread4(LockProducerConsumer lockProducerConsumer) {
		// TODO Auto-generated constructor stub
		this.lockProducerConsumer=lockProducerConsumer;
	}
	public void run(){
		for(int i=0;i<=15;i++){
		try {
			System.out.println("In consumer"+i);
			lockProducerConsumer.consume();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	}
}


public class LockProducerConsumer {

	Lock plock=new ReentrantLock();
	//Lock clock=new ReentrantLock();
	Condition pcond=plock.newCondition();
	Condition ccond=plock.newCondition();
	
	int size=10;
	public void produce() throws InterruptedException
	{		
		try{
			plock.lock();
			System.out.println("size is "+size);
			if(size==10)
			{
				System.out.println("producer waiting");
				pcond.await();
				
			}
			size++;
			ccond.signalAll();
		}
		finally {
			//if(plock.tryLock())
			plock.unlock();
		}
	}
	
	public void consume() throws InterruptedException{
		System.out.println("size is "+size);
		try{
			plock.lock();
			System.out.println("size is "+size);
			if(size==0)
			{
				System.out.println("consumer waiting");
				ccond.await();
			
			}
			size--;
			pcond.signalAll();
		}
		finally {
			//if(clock.tryLock())
			plock.unlock();
			
		}
	}
	public static void main(String[] args) {
		LockProducerConsumer lpc=new LockProducerConsumer();
		Thread t3=new Thread3(lpc);
		Thread t4=new Thread4(lpc);
		
		t3.start();
		t4.start();
	}

}
