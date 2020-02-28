package arrays;

import java.util.Arrays;

public class MeetingRoom {

	public static void main(String[] args) {
		int start[]={1,2,5,7,3,4,6};
		int end[]={3,5,6,7,9};
		int l=start.length>end.length ?end.length:start.length;
		
		Arrays.sort(start);
		Arrays.sort(end);
		System.out.println(Arrays.toString(start));
		System.out.println(Arrays.toString(end));
		int count=0;
		
		if(start[0]<end[0])
			count++;
		int i=1;
		
	   while(i<=l-1)
	   {
		   if(start[i]<start[i] && start[i]> end[i-1])
			   count++;
		   i++;
	   }
		
		System.out.println(count);

	}

}
