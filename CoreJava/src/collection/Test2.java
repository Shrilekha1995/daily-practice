package collection;

public class Test2 {

	public static void main(String[] args) {
		String str ="abcd kbcd the jo kljp nbcd tbcd lop kvbcd";
		
		String key="bcd";
		
		int count=0;
		
		String[] arr=str.split(" ");
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i].contains(key))
				count++;
		}
		System.out.println(count);
		

	}

}
