package number;

public class FindNumber {

	public static void main(String[] args) {

		findNumber(145405, 5);

	}

	private static void findNumber(int number, int j) {

		String num=String.valueOf(number);
		String k=String.valueOf(j);
		String ans="";
		String r="";
		if(j!=0&&num.contains(k))
		{
			int i=num.indexOf(k);
			System.out.println(num.substring(0,i));
			System.out.println(j-1);
			int z=num.substring(i+1).length();
			while(z-->0)
				r=r+"9";
			System.out.println(r);
			//ans=num.substring(0,i)+(Integer.valueOf(num.charAt(i))-1)+num.substring(i+1).length();
		}
		System.out.println(ans);
	}

	/*
	 * private static int findNumber(int number, int j) {
	 * 
	 * String key=String.valueOf(j);
	 * 
	 * for(int i=number;i>0;i--) { if(String.valueOf(i).indexOf(key)==-1) return
	 * i;
	 * 
	 * }
	 * 
	 * return -1; }
	 */

}
