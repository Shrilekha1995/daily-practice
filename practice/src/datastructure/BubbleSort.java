package datastructure;

import java.util.Arrays;
import java.util.List;

class Employee{
	int id;

	public Employee(int id) {
		super();
		this.id = id;
	}
	
	
}

public class BubbleSort {

	public static void main(String[] args) {
		int temp;
		boolean flag=false;
		int [] arr={-3,4,2,8,3,5,9};
		
		String str="a123";
		int number=Integer.parseInt(str);
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length-i-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					flag=true;
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
			if(!flag)
			{
				break;
			}
		}
		
		List<Employee> list=Arrays.asList(new Employee(1),new Employee(2));
	
		System.out.println(Arrays.toString(arr));
		
	}
	

	

	/*rivate static void swap(int i, int j) {
		int temp;
		temp=i;
		i=j;
		j=temp;
		
	}*/
}
