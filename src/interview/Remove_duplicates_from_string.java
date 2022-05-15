package interview;

import java.util.LinkedHashSet;

public class Remove_duplicates_from_string {
	public static void main(String[] args)
	{
	// Approach 1....
		String text="java Programming";
		char[] ch=text.toCharArray();
//	//______________________________________________________________________	
//		LinkedHashSet<Character> ls=new LinkedHashSet<Character>();
//		for(char e:ch)
//		{
//			if(ls.add(e)==true)
//			{
//				System.out.print(e);
//				
//			}
//			
//		}
	//_______________________________________________________________________	
	// Approach 2....
		
		
		for (int i=0;i<ch.length;i++)
		{
			boolean repeated=false;

			for(int j=i+1;j<ch.length;j++)
			{
				if (ch[i] == ch[j])
				{
					repeated=true;
					break;
				}
			}
			
			if(!repeated)
			{
				System.out.print(ch[i]);
			}
		}
		
		
		
		
		
	}
}
