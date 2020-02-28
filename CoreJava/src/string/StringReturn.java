package string;

public class StringReturn {

	public static void main(String[] args) {
	
		System.out.println(display());

	}

	private static String display() {
	String s="";
		
		try{
			s="try";
			return s;
		}
		
		finally{
			s="abc";
			//return s;
		}
	
	}

}
