import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class ArrayManipulation {

	public static void main(String[] args) {
		
		
	    int []A = {-20, 20, -10, 20, 0, 4, 8, -20, 10, -10, 8, 6, 15, 9, 18, 35, 40, -30, -90, 99};
	    int N = 20;
	    int X=4;
	    
	    ArrayList<Integer> al=new ArrayList<>();
	    ArrayList<Integer> al2=new ArrayList<>();
	    HashSet<Integer> hs= new HashSet<>();
	    HashMap<Integer,ArrayList<Integer>> hm=new HashMap<>();
	    
	    for(int i=0;i<A.length;i++){
	    	
	    	if(!hs.add(A[i]))
	    	{
	    		al.add(A[i]);
	    	}
	    }
	    
	    for(int i=0;i<A.length;i++)
	    {
	    	if(!al.contains(A[i]))
	    	{
	    		al2.add(A[i]);
	    	}
	    }
	    
	    al2.forEach(System.out::println);
	    
	    int k=0;
	    for(int i=0;i<al2.size()-3;i++)
	    {
	    	if(al2.get(i)>=al2.get(i+3)){
	    		int num=Math.abs(A[i])*1000+Math.abs(A[i+1])*100+Math.abs(A[i+2])*10+Math.abs(A[i+3]);
	    		System.out.println(Math.abs(A[i])*1000+Math.abs(A[i+1])*100+Math.abs(A[i+2])*10+Math.abs(A[i+3]));
	    		//String str=" "+A[i]+A[i+1]+A[i+2]+A[i+3];
	    		//System.out.println(num);
	    	   // hm.put(,Arrays.asList(Math.abs(al2.get(i)),A[i+1],A[i+2],A[i+3]));
	    		System.out.println(al2.get(i)+" "+al2.get(i+1)+" "+al2.get(i+2)+" "+al2.get(i+3));
	    	}
	    }
	    
	}

}
