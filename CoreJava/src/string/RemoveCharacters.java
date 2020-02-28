package string;

public class RemoveCharacters {

	public static void main(String[] args) {
	String first="hey how are you";
	String second="eou";
	StringBuffer rev=new StringBuffer();
	boolean flag=false;
	
	
	for(int i=0;i<first.length();i++)
	{
		for(int j=0;j<second.length();j++)
		{
			if(first.charAt(i)==second.charAt(j))

			{
				flag=true;
				
			}
		}
	
	    if(flag==false)
	    {
	    	rev.append(first.charAt(i));
	    
	    }
	
      flag=false;
	}
System.out.println(rev);
}
}