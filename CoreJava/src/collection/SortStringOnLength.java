package collection;

import java.util.Arrays;
import java.util.Collections;

public class SortStringOnLength {

	public static void main(String[] args) {
		String str="hey hoyu th nklhop h a h h vbhjklop";
		
		String s[]=str.split(" ");
		String temp=" ";
		
		for(int i=0;i<s.length;i++)
		{
			for(int j=0;j<s.length-i-1;j++)
			{
				if(s[j].length() > s[j+1].length())
				{
					temp=s[j];
					s[j]=s[j+1];
					s[j+1]=temp;
				}
			}
		}
		
		System.out.println(Arrays.toString(s));

	}

}
