package com.app.logic;

public class Calculations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	
	public static int findmax(int [] arr)
	{
		int max=1;
		for(int i=0;i<arr.length;i++)
		{
			if(max<arr[i])
				max=arr[i];
		}
		return max;
	}
}
