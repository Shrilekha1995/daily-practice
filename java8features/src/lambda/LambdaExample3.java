package lambda;

interface Adder{
	
	int add(int a,int b);
}

public class LambdaExample3 {

	public static void main(String[] args) {
		
		
		Adder ad1=(a,b)->a+b;
		
		
		System.out.println(ad1.add(5, 4));
		

	}

}
