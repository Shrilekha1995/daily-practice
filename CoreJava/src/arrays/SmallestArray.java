package arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class SmallestArray {

	public static void main(String[] args) {
		
		int a[]={5,-3,4,-44,-47,-78,-1,-2,-6,-2,3,-3,3,-3};
		int b[]=new int[a.length];
		/*int k=0;
		int b[]=new int[a.length];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<0&&k<a.length)
			{
				b[k]=a[i];
				k=k+2;
				i=0;
			}
		}
		for(int i=0;i<a.length;i++)
		{
			if(b[i]>0)
			{
				continue;
			}
			b[i]=a[i];
		}
		System.out.println(Arrays.toString(b));*/
		
		
		
		ArrayList<Integer> negarr=new ArrayList<>();
		ArrayList<Integer> posarr=new ArrayList<>();
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<0)
			{
				negarr.add(a[i]);
			}
			else{
			
				posarr.add(a[i]);
			}
			
			
			
			
			
			
			
			
			
			
			
			
		}
		
		if(negarr.size()>posarr.size())
		{
			int sub=negarr.size()-posarr.size();
			
			for(int i=0;i<sub;i++)
			{
				b[i]=negarr.get(i);
			}
			int k=0;
			int p=sub;
			boolean flag=true;
			for(int i=sub;i<a.length;i++)
			{
				if(flag==true)
				{
				b[i]=posarr.get(k);
				k++;
				flag=false;
				}
				else{
					b[i]=negarr.get(p);
					p++;
					flag=true;
					
				}
			}
		}
		
		
		System.out.println(Arrays.toString(b));
		
		
		
	}
}
