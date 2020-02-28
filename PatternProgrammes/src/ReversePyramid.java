import java.util.Scanner;

public class ReversePyramid {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of columns need to be printed");
		int cols=sc.nextInt();
		sc.close();
		
		for(int i=0;i<cols;i++)
		{
			for(int j=0;j<i;j++)
			{
				System.out.print(" ");
			}
			for(int k=0;k<cols-2*i;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		

	}

}
