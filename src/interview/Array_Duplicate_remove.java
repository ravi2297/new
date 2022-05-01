package interview;

import java.util.Arrays;
import java.util.HashSet;

public class Array_Duplicate_remove {

	public static void main(String[] args)
	{
		String[] Lang= {"java","c#","Ruby","Python","c++","c","java","c#"};
		
		HashSet<String> hs=new HashSet<String>();
		
		//we taking HashSet because, hashset doesn't allow duplicates.
		// when you try to add duplicate in hashset it gives output to false.
		// the "e" variable reading each value from Lang array
		// and we are trying to add value in hashset so it gives us false ..false means duplicate.
		
		for(String e:Lang)
		{
			if (hs.add(e) == true)
			{
				System.out.print(e + " ");
			}
			
		}
		
		
	}
}
