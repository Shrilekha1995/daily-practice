package number;

public class CheckBinaryNumber {

	public static void main(String[] args) {
		
		int num=10101011;
		System.out.println(checkBinary(num));
	}

	private static boolean checkBinary(int num) {
		
		String str=String.valueOf(num);
		String emp="";
		return emp.matches("[0-1]+");
	}

	/*	String str=String.valueOf(num);
		boolean flag=true;;

        for(int i=0;i<str.length();i++)
        {
        	if(str.charAt(i)=='1' || str.charAt(i)=='0')
        	{continue;
        		
        	}
        	else{
        		flag=false;
        	}
        	
        }
        return flag;
	}*/

}
