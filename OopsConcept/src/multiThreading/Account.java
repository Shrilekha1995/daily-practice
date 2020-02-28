package multiThreading;

public class Account implements Runnable {
	
	int balance;
	int counter=1;
	

	public Account(int balance) {
		super();
		this.balance = balance;
	}
	
	synchronized public void withdraw(int amount)
	{
		System.out.println(Thread.currentThread().getName());
	       
			if(Thread.currentThread().getName().equals("wife")&& counter>1)
			{
				counter--;
				try {
					wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
			}
			
		
		System.out.println("balance before withdraw amount "+amount+" is: "+balance+Thread.currentThread().getName());
		balance=balance-amount;
		System.out.println("balance after withdraw amount "+amount+" is: "+balance+Thread.currentThread().getName());
		notifyAll();
	}
	
	synchronized public void deposit(int amount)
	{
		System.out.println("balance before deposit amount "+amount+" is: "+balance+Thread.currentThread().getName());
		balance=balance+amount;
		System.out.println("balance after deposit amount "+amount+" is: "+balance+Thread.currentThread().getName());
	}



	@Override
	public void run() {
	
		
		withdraw(1000);
		
	}

	
}
