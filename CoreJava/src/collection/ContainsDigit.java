package collection;

public class ContainsDigit {

	public static void main(String[] args) {
		
		int number=1000;
		int key=0;
		
		System.out.println(findNumber(number,key));
		

	}

	private static int findNumber(Integer number, int key) {
		
		
		String c=String.valueOf(key);
	/*	int length=c.length();
		StringBuffer s=new StringBuffer(""); 
		for(int i=length;i> 0;i--){
			if(number/(int)Math.pow(10, i) == key){
				number=(number/(int)Math.pow(10, i))*(int)Math.pow(10, i)-1;
				s.append(number.toString());
				break;
			}else{
				s.append(String.valueOf((number/(int)Math.pow(10, i))));
				number=number%(int)Math.pow(10, i);
			}
		}
		int n=Integer.valueOf(new String(s));*/
		
	for(int i=number;i>0;i--)
	{
		
		if(Integer.toString(i).indexOf(c)==-1)
			
			return i;
		}
		return -1;
	}

}
