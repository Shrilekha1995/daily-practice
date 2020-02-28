import java.util.Scanner;

public class StarPyramidMatrix {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter number of rows");
		int rows=sc.nextInt();
		
		sc.close();
		
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<2*rows-1;j++)
			{
				if(j>=rows-1-i && j<=rows-1+i){
				System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		
		

	}

}
