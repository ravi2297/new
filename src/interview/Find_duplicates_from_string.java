package interview;

import java.util.LinkedHashSet;

public class Find_duplicates_from_string {
	public static void main(String[] args)
	{
		//find duplicates charactes in String
		String text="java code";
		
		char[] ch=text.toCharArray();
		
		LinkedHashSet<Character> ls=new LinkedHashSet<Character>();
		
		for (char e:ch)
		{
			if (ls.add(e)==false)
			{
				System.out.print(e+" ");
			}
		}
	}
}
