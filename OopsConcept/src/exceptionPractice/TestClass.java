package exceptionPractice;

import java.util.Scanner;

public class TestClass {

	public static void main(String[] args) throws CustomNullexception {
		
		Scanner sc=new Scanner(System.in);
		
	
		Employee [] employeeArr=new Employee[3];
		
		employeeArr[0]=new Employee(13,"abc",1000);
		employeeArr[1]=new Employee(21,"pqr",1000);
		employeeArr[2]=new Employee(38,"pqr",1000);
		
	
		
		
		
			
			System.out.println("Enter id to get employee details ");
			
			int id=sc.nextInt();
			
			findDetails(id,employeeArr);

		
			
			
	
		

	}

	private static void findDetails(int id,Employee[]employeeArr ) throws CustomNullexception {
		boolean flag=false;
		
		try{
		for(int i=0;i<employeeArr.length;i++)
		{
			if(id==employeeArr[i].id)
			{
				System.out.println(employeeArr[i]);
				flag=true;
			}
			
		}
		if(flag==false)
		    throw new CustomNullexception("Record does not exist");
		
		}catch(CustomNullexception ex)
		{
			System.err.println(ex.getMessage());
		}
		
	}

}
