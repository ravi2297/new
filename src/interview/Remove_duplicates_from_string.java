package interview;

import java.util.LinkedHashSet;

public class Remove_duplicates_from_string {
	public static void main(String[] args)
	{
		String text="java Programming";
		char[] ch=text.toCharArray();
		
		LinkedHashSet<Character> ls=new LinkedHashSet<Character>();
		for(char e:ch)
		{
			if(ls.add(e)==true)
			{
				System.out.print(e);
			}
			
		}
	}
}
