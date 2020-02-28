package string;

public class StringLength {

	public static void main(String[] args) {
		String str="world";
	
		int i=0;
		try
		{
			while(str.charAt(i)!='\0'){
				i++;
			}
		}
		catch (StringIndexOutOfBoundsException e) {
			System.out.println(i);
		}
		

	}

}
