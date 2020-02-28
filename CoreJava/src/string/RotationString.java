package string;

public class RotationString {

	public static void main(String[] args) {
		
		
		String str1="abc";
		String str2 ="cab";
		
		String third=str1+str1;
		
		if(third.contains(str2))
		{
			System.out.println("true");
		}
		else{
			System.out.println("false");
		}

	}

}
