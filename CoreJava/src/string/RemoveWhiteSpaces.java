package string;

import java.util.Arrays;

public class RemoveWhiteSpaces {

	public static void main(String[] args) {
		
		
		String str=" hey   how   are you";
		
		StringBuilder str1=new StringBuilder("");
		
		String []arr=str.trim().split("\\s+");
		System.out.println(arr.length);
		System.out.println(Arrays.toString(arr));
		
		for(int i=0;i<arr.length;i++)
		{
			str1.append(arr[i]);
		}
System.out.println(str1);
	}

}
