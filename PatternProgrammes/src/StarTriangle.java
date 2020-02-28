import java.util.Scanner;

public class StarTriangle {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter number of rows need to be printed");
		int rows=sc.nextInt();
		sc.close();
		
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		

	}

}
