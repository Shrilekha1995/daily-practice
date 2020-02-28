package string;

import java.util.Arrays;

public class StringWords {

	public static void main(String[] args) {
		String str="hey  how are    you";
		String [] arr=str.split("\\s+");
		
		System.out.println(arr.length);

	}

}
