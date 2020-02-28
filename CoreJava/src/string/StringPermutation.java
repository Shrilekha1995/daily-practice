package string;

public class StringPermutation {

	public static void main(String[] args) {
		
		permutation("abc","");

	}

	private static void permutation(String input, String output) {
		if(input.length()==0)
			System.out.println(output);
		String s="";
		for(int i=0;i<input.length();i++)
		{
			s=input.substring(0,i)+input.substring(i+1);
			permutation(s, output+input.charAt(i));
		}
		
	}

}
