package collection;

import java.util.HashMap;

public class StringAnagram {

	public static void main(String[] args) {
		String str1="Mother In Law";
		String str2="Hitler Woman";
		
		
		HashMap<Character,Integer> hm=characterCount(str1);
		HashMap<Character,Integer> hm2=characterCount(str2);
		
		System.out.println(hm);
		System.out.println(hm.equals(hm2));
	  System.out.println(hm2);
	}

	private static HashMap<Character, Integer> characterCount(String str1) {
		HashMap<Character,Integer> hm=new HashMap<>();
		
		String str=str1.toLowerCase().replaceAll(" ","");
		
		for(int i=0;i<str.length();i++)
		{
			if(hm.containsKey(str.charAt(i)))
			{
				hm.put(str.charAt(i),hm.get(str.charAt(i))+1);
			}
			else{
				hm.put(str.charAt(i),1);
			}
		}
		
		return hm;
	}

}
