package questions;

import java.util.Arrays;

public class GreatestNumber {

	public static void main(String[] args) {
		String str="str12jkil4kil900poi6789kl12";
		System.out.println(Arrays.asList(str.split("([a-zA-Z]+)")).stream().filter( a->!a.equals("")).map(Integer::parseInt).max(Integer::compare).get()
		);
		
		
	}

}
