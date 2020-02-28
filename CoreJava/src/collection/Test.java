package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Test {
//list.get((int)
	public static void main(String[] args) {
		List<Number> list=new ArrayList<>();
		list=Arrays.asList(1,3,4,5,6,7,8,9,10);
		List<Number> list1=new ArrayList<>();
		list1=Arrays.asList(1,3,4,5,6,7,8,9,10);
		
		List<List<Number>> ll=Arrays.asList(list,list1);
		System.out.println(ll);
		
		List<Number>flatList=ll.stream().flatMap(l->l.stream()).collect(Collectors.toList());
		//System.out.println(list.get((int)(Math.random()*10)));
		System.out.println(flatList);
	
	}
}
