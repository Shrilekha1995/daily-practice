package string;

import java.util.ArrayList;
import java.util.Arrays;

public class ReverseStringPreserveSpaces {

	
	public static void main(String[] args) {
		
		
	
		String str="h ey how arer";
		
		char[] str1=str.toCharArray();
		
		int j=str.length()-1;
		char temp;
		int i=0;
		while(i<=j)
		{
			if(str1[i]!=' ')
			{
				while(str1[j]==' ')
					j--;
			temp=str1[j];
			str1[j]=str1[i];
			str1[i]=temp;
			j--;
			}
			i++;
		}
		
		
		
		System.out.println(new String(str1));
	}

}
