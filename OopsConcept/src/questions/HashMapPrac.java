package questions;

import java.util.HashMap;

public class HashMapPrac {

	public static void main(String[] args) {
		
		String str="hey hello hey how are you";
		
		HashMap<String,Integer> hm=new HashMap<>();
		String[] k=str.split(" ");
		
		for(int i=0;i<k.length;i++)
		{   
			int count=1;
			if(hm.containsKey(k[i])==true)
			{
				hm.put(k[i], hm.get(k[i])+1);
			}
			else
			{
			hm.put(k[i], count);
			}
		}
		
		System.out.println(hm);
		

	}

}
