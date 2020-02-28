package string;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class highestOccuringCHar {

	public static void main(String[] args) {
		String s="aaaaaaaabbbbbbcwsssfgh";
		char c[]=s.toCharArray();
		
		//Stream.of(c).collect(Collectors.toMap(x->x, x->)).forEach((k,v)->{System.out.println(k+" "+v);});;
		HashMap<Character,Integer> hm=new HashMap<>();
		for(int i=0;i<c.length;i++)
		{
			if(hm.containsKey(c[i]))
			{
				hm.put(c[i], hm.get(c[i])+1);
			}
			else
			{
				hm.put(c[i],1);
			}
		}
		
		//Map<Object, Object> hm=Stream.of(c).collect(Collectors.toMap(x->x,x->5));
		
		int aa=(int) hm.values().stream().max((a,b)->a.compareTo(b)).get();
		System.out.println(aa);
		hm.forEach((k,v)->{if(v==aa)
			System.out.println(k);});
	}
}
