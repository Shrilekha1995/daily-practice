import java.util.Scanner;

public class StarDashPattern {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int n = sc.nextInt();
		int k;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<(2*n-1);j++)
			{
				if(j>=n-1-i&&j<=n-1+i)
				{
					if(i%2==0&&j%2!=0)
					{
						System.out.print("-");	
					}
					else if(i%2!=0&&j%2==0)
					{
						System.out.print("-");
					}
					else
					{
						System.out.print("*");
					}
					
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
				
	}
}
