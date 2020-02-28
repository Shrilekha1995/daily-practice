package string;

public class TestString {

	public static void main(String[] args) {
		String s="This is my string";
		//Ti i m srn
		String sa[]=s.split(" ");
		String op="";
		for(String t:sa)
		{
			String r="";
			for(int i=0;i<t.length();i++)
			{
				if(i%2==0)
					r+=t.charAt(i);
			}
			op=op+r+" ";
		}
		System.out.println(op);
	}
}
