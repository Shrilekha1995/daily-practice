package arrays;

import java.util.Arrays;

public class ArraySortPreserveNegative {

	public static void main(String[] args) {
		int arr[]={10,9,-1,-4,6,2,-9,-10};
		
	int temp;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length-1;j++)
			{
				if(arr[i]<arr[j] && arr[i]>0 && arr[j]>0)
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
		System.out.println(Arrays.toString(arr));

	}

}
