package tester;

import synchro.MySynch;

public class TestSync {

	public static void main(String[] args) {
		MySynch sybc=new MySynch();
		Thread t1=new Thread(sybc, "ONE");
		Thread t2=new Thread(sybc, "two");
		t1.start();
		t2.start();
	}
}
