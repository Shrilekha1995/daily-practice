package string;

public class CharacterCount {

	public static void main(String[] args) {
		
		String str="  hey hi    how  ";
		
		String st=str.replaceAll("\\s","");
		System.out.println(st.length());
		
		

	}

}
