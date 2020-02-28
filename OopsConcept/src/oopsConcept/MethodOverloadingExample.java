package oopsConcept;

public class MethodOverloadingExample {
	
	private int add(int a,int b) throws Exception{
		System.out.println("in integr");
		return a+b;
		
	}
	
	private double add(double a,double b)throws Exception{
		System.out.println("in float");
		return a+b;
		
	}

	public static void main(String[] args) throws Exception {
		MethodOverloadingExample obj=new MethodOverloadingExample();
		
		obj.add(10.7, 15.9);
		obj.add(10, 15);
	

	}

}
