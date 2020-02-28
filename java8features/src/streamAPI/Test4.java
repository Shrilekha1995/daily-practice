package streamAPI;

public class Test4 {

	public static void main(String[] args) {
		
		String str="hey how are you cow mow tow owt kown knot";
		String[] arr=str.split(" ");
		int count=0;
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i].endsWith("ow"))
				count++;
			
		}
 System.out.println(count);
	}

}
