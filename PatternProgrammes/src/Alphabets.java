import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Alphabets {

	public static void main(String[] args) {
		
		
		
Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter number of rows need to be printed");
		int rows=sc.nextInt();
		sc.close();
		
		List<Character> al=Arrays.asList('a','b','c','d','e','f','g','h');
		int index;
		for(int i=0;i<rows;i++)
		{
			index=rows-1;
			for(int j=0;j<2*rows;j++)
			{
				if(j>=rows-1-i && j<=rows+i-1)
				{
					
					/*if(j/2==0)
						index--;
					else{
						index++;
					}*/
					if(true)
					{
					System.out.print(al.get(index));
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
