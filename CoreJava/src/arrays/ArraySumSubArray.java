package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraySumSubArray {
	
	public static void main(String[] args) {
		
	
	
	int[] arr={1,3,5,7,8,2,9,11};
	int key=8;
	List<List<Integer>> l=new ArrayList<>();
	for(int i=0;i<arr.length;i++)
	{
		for(int j=i+1;j<arr.length;j++)
		{
			
			if(arr[i]+arr[j]==key)
			{
				l.add(Arrays.asList(arr[i],arr[j]));
			}
		}
		
	}
	l.forEach(System.out::println);

}
}