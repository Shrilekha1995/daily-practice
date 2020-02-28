package tester;


class Thread1 extends Thread{
	ProducerConsumerProblem producerConsumerProblem;
	public Thread1(ProducerConsumerProblem producerConsumerProblem) {
		// TODO Auto-generated constructor stub
		this.producerConsumerProblem=producerConsumerProblem;
	}
	public void run(){
		for(int i=0;i<=15;i++){
		try {
			System.out.println("In Producer"+i);
			producerConsumerProblem.produce();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	}
}

class Thread2 extends Thread{
	ProducerConsumerProblem producerConsumerProblem;
	public Thread2(ProducerConsumerProblem producerConsumerProblem) {
		// TODO Auto-generated constructor stub
		this.producerConsumerProblem=producerConsumerProblem;
	}
	public void run(){
		for(int i=0;i<=15;i++){
		try {
			System.out.println("In consumer"+i);
			producerConsumerProblem.consume();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	}
}


public class ProducerConsumerProblem{
     int size=8;
	public synchronized  void produce() throws InterruptedException
	{		System.out.println("size is "+size);
			if(size==10)
			{
				System.out.println("producer waiting");
				wait();
			}
			size++;
			notify();
	}
	
	public synchronized void consume() throws InterruptedException{
		System.out.println("size is "+size);
				if(size==0)
				{System.out.println("consumer waiting");
					wait();
				}
				size--;
				notify();
			}
		
	
	public static void main(String[] args) {
		ProducerConsumerProblem p=new ProducerConsumerProblem();
		Thread t1=new Thread1(p);
		Thread t2=new Thread2(p);
		t1.start();
		t2.start();

	}

}
