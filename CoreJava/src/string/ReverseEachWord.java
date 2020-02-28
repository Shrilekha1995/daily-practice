package string;

public class ReverseEachWord {

	public static void main(String[] args) {
		String str="hey how are you";
		String[] arr=str.split(" ");
		StringBuffer reverse=new StringBuffer(" ");
		
		for(int i=0;i<arr.length;i++)
		{
			
			reverse.append(new StringBuffer(arr[i]).reverse()+" ");
		}
		
		System.out.println(reverse);

	}

}
