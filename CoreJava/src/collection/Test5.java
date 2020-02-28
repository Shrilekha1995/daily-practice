package collection;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class Test5 {

	public static void main(String[] args) {

		String str = "toppputklmnb";

		Map<Character, Integer> hm = new LinkedHashMap<>();

		for (int i = 0; i < str.length(); i++) {
			if (hm.containsKey(str.charAt(i))) {
				hm.put(str.charAt(i), hm.get(str.charAt(i)) + 1);
			} else
				hm.put(str.charAt(i), 1);
		}
		System.out.println(hm);
		/*hm.forEach((k, v) -> {
			if (v == 1) 
				System.out.println(k);
				
			
		});*/
		for(Map.Entry<Character, Integer> map:hm.entrySet())
		{
			if(map.getValue()==1)
			{
				System.out.println(map.getKey());
				break;
			}
		}
		
		
	
	
	}}
