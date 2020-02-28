package collection;

public class StringShuffle {

	public static void main(String[] args) {
		
		String first="abc";
		String  second="xyz";
		String third="axbycz";
		
		
		 System.out.println(findPreserveOreder(first,second,third));
		
		

	}

	private static boolean findPreserveOreder(String first, String second, String third) {
		int k=0;
		int count1=0;
		int p=0;
		int counter2=0;
		boolean flag1=false,flag2=false;
		for(int i=0;i<third.length();i++)
		{
			if(first.charAt(k)==third.charAt(i))
			{
				k++;
				count1++;
			}
		    if(count1==3)
		    {
		    	flag1=true;
		    	break;
		    }
		
		}
		for(int i=0;i<third.length();i++)
		{
		if(second.charAt(p)==third.charAt(i))
		{
			p++;
			counter2++;
		}
		 if(counter2==3)
		 {
			 flag2=true;
			 break;
		 }
		}
		
		if(count1!=3)
			return false;
		if(counter2!=3)
			return false;
		if(flag1==true && flag2==true)
			return true;
		
		return true;
		
	}

}
