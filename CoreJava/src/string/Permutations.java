package string;

import java.util.ArrayList;

public class Permutations {

	public static void main(String[] args) {
		String str = "abc";
		

		permute(str, "");

	}

	private static void permute(String str, String ans) {
		if (str.length() == 0)
			System.out.println(ans);
		for (int i = 0; i < str.length(); i++) {
			String op = str.substring(0, i) + str.substring(i + 1);
		
	
			permute(op, ans + str.charAt(i));
		}
	}

}
