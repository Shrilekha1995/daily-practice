package collectionPractice;

import java.util.HashMap;
import java.util.Map;

public class TestClass {
	
	

	public static void main(String[] args) {
		
		HashMap<Integer,String> hm1=new HashMap<>();
		hm1.put(1,"shri");
		hm1.put(2,"shri");
		hm1.put(3,"shreya");
		
		for(Map.Entry<Integer, String> n:hm1.entrySet())
			System.out.println(n.getKey()+ " "+ n.getValue());
		

	}

}
