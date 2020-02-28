package exceptionPractice;

public class TestClass2 {

	public static void main(String[] args) {
		
		try{
		
		int a=10/0;
		System.out.println("hey");
		
		}catch(Exception e)
		{
			System.out.println("exception");
		    throw new ArithmeticException();
		}
  System.out.println("checking 2");
	}

}
