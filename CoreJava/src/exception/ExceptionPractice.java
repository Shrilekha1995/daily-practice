package exception;

import java.io.IOException;
import java.sql.SQLException;

public class ExceptionPractice {

	public static void main(String[] args) {
		try{
		display();
		}
		catch(NullPointerException e)
		{
			System.out.println("in main");
		}

	}

	private static void display()  {
		
		
		/*try{
			throw new NullPointerException();
		}
		catch(NullPointerException e){
			
			System.out.println("here");
			throw new ArithmeticException();
			
		}catch(ArithmeticException ex){
			System.out.println("here 2");
			throw new Exception();
		}catch(Exception e)
		{
			System.out.println("here 3");
		}
		*/
	}

}
