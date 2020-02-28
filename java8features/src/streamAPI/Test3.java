package streamAPI;

public class Test3 {

	public static void main(String[] args) {
		int size=3;
		int lines=size+(size-1);
		
		for(int i=97+size-1;i>=97;i--)
		{
			for(int j=0;j<lines-1;j++)
			{
				System.out.print("-");
				
			}
				System.out.print((char)i);
		
			for(int j=0;j<lines-1;j++)
				{
					System.out.print("-");
			
				}
			System.out.println();
		
		}
		
		
	
		
		
	}
}
