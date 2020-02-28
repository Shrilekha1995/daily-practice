package company;

public class StringExample {
	

	

	public static void main(String[] args) {
		
		String str1="abc";
		
		String str2="abc";
		
		String str3=new String("abc");
		String str4=new String("abc");
	
		System.out.println("abc".hashCode());
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		System.out.println(str3.hashCode());
		System.out.println(str4.hashCode());
		System.out.println(str1==str4);
		  
		  System.out.println("---------------------------------");  
		System.out.println(System.identityHashCode("abc"));
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		System.out.println(System.identityHashCode(str3));
		System.out.println(System.identityHashCode(str4));
		

		

	}

}
