package streamAPI;

import java.util.HashMap;

public class Test2 {

	public static void main(String[] args) {

		String[] magzine = { "two" ,"times", "three", "is", "not", "four" };
		String[] note = { "two" ,"times", "two", "is", "four" };

		checkMagazine(magzine, note);
	}

	static void checkMagazine(String[] magazine, String[] note) 
	{
		boolean flag = true;
		HashMap<String, Integer> magazineList = new HashMap<>();
		HashMap<String, Integer> noteList = new HashMap<>();
		
		if(magazine.length<note.length)
		{
			flag = false;
		}
		else
		{
			for(int i=0;i<magazine.length;i++)
			{
				if(magazineList.containsKey(magazine[i]))
				{
					magazineList.put(magazine[i], magazineList.get(magazine[i])+1);
				}
				else
				{
					magazineList.put(magazine[i], 1);
				}
			}
			for(int i=0;i<note.length;i++)
			{
				if(noteList.containsKey(note[i]))
				{
					noteList.put(note[i], noteList.get(note[i])+1);
				}
				else
				{
					noteList.put(note[i], 1);
				}
			}
			
			for(int i=0;i<note.length;i++)
			{
				if(magazineList.containsKey(note[i]))
				{
					if(noteList.get(note[i])<=magazineList.get(note[i]))
					{
						flag = true;
					}
					else
					{
						flag = false;
					}
				}
				else
				{
					flag = false;
				}
			}
		}
		if(flag == false)
			System.out.println("No");
		else
		{
			System.out.println("Yes");
		}
	}

}
