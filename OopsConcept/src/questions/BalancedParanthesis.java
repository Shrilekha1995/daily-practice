package questions;

public class BalancedParanthesis {

	public static void main(String[] args) {
		String s1="{(a+b)+(a*b)";
		char[] arr=s1.toCharArray();
		
		int count1=0;
		int count2=0;
		int count3=0;
		int count4=0;
				
		for(int i=0;i<arr.length;i++)
		{
			
			if(arr[i]=='{')count1++;
			if(arr[i]=='}')count2++;
			if(arr[i]=='(')count3++;
			if(arr[i]==')')count4++;
		}
		
		if(count1==count2 && count3==count4)
		{
			System.out.println("balanced");
		}
		else
		{
			System.out.println("unbalanced");
		}
		
		

	}

}
