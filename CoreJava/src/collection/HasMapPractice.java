package collection;

import java.util.HashMap;
import java.util.Map.Entry;

public class HasMapPractice {

	public static void main(String[] args) {
		
		HashMap<Emp,Integer> hm=new HashMap<>();
		
		/*hm.put(new Employee("abc"), 1);
		hm.put(new Employee("xyz"), 2);
		hm.put(new Employee("abc"), 2);*/
		hm.put(new Emp(1, "abc", 345678), 1);
		hm.put(new Emp(1, "abc", 345678), 5);
		hm.put(new Emp(2, "abc", 345678), 1);
		
		for(Entry<Emp,Integer> hm1: hm.entrySet())
{
			System.out.println(hm1.getKey()+ " "+hm1.getValue());
		}
		
		for(Emp e:hm.keySet())
		{
			System.out.println(e);
		}
		for(Integer e:hm.values())
		{
			System.out.println(e);
		}

	}

}/*

class Employee{
	String name;
	
	Employee(String name){
		this.name=name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	
}
*/