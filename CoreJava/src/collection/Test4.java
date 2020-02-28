package collection;

import java.util.Arrays;

public class Test4 {

	public static void main(String[] args) {
	
		
		String str="how are you";
		int counter1=0;
		int counter2=0;
		
		String s="AaEeIiOoUu";
		
		
	    for(int i=0;i<str.length();i++)
	    {
	    	/*if(str.charAt(i)=='a' ||str.charAt(i)=='A' || str.charAt(i)=='E' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u' || str.charAt(i)=='U')
	    		counter1++;
	    	else if(str.charAt(i)==' ')
	    	{
	    		continue;
	    	}
	    	else{
	    		counter2++;
	    	}*/
	    	
	    	if(s.contains(String.valueOf(str.charAt(i))))
	    	{
	    		counter1++;
	    	}
	    	else if(str.charAt(i)==' ')
	    	{
	    		continue;
	    	}
	    	else{
	    		counter2++;
	    	}
	    }
	    
	    System.out.println(counter1+" "+counter2);
	}

}
