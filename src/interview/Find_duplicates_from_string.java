package interview;

import java.util.LinkedHashSet;

public class Find_duplicates_from_string {
	public static void main(String[] args)
	{
//		//find duplicates charactes in String
//		String text="java code";
//		
//		char[] ch=text.toCharArray();
//		
//		LinkedHashSet<Character> ls=new LinkedHashSet<Character>();
//		
//		for (char e:ch)
//		{
//			if (ls.add(e)==false)
//			{
//				System.out.print(e+" ");
//			}
//		}
		
		String name="java Programming";
		char[] ch=name.toCharArray();
		int count=0;
		
		for (int i=0;i<ch.length;i++)
		{
			
			for (int j=i+1;j<ch.length;j++)
			{
				if(ch[i] == ch[j])
				{
					System.out.println("duplicate characters are :" + ch[i]);
					count++;
					
				}
			}
			
		}
		System.out.println("the duplicate characters are :" + count);
		
		
		
		
		
		
		
		
		
		
		
	}
}
