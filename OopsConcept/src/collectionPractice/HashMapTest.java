package collectionPractice;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest {

	public static void main(String[] args) {
		Map<Employee,Integer>hm=new HashMap<>();
		hm.put(new Employee(1), 50);
		hm.put(new Employee(2), 60);
		hm.put(new Employee(1), 70);
		System.out.println(hm.size());
		System.out.println(hm.get(new Employee(1)));
		
		
		

	}
	

}
