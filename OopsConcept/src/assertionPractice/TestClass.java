package assertionPractice;

import java.util.Scanner;

public class TestClass {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int value=sc.nextInt();
		
		assert value>20 : "incorrect value";
		
		System.out.println(value);

	}

}
