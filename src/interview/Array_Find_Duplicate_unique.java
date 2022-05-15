package interview;

import java.util.Arrays;
import java.util.HashSet;

public class Array_Find_Duplicate_unique {

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
		
		
		
// find Unique in array.............
		
		int[] num={12,15,12,10,90,45};
		
		for (int i=0;i<num.length;i++)
		
		{
			int count=0;
			for (int j=0;j<num.length;j++)
			{
				if (num[i]==num[j])
				{
					count++;
				}
				
				
			}
			if(count==1)
			{
			System.out.println(num[i]);
			}
		}
		
		//Find Duplicates in array.................

		int[] b={10,12,15,12,10,90,45};
		
		for (int i=0;i<b.length;i++)
		
		{
			int count=0;
			for (int j=i+1;j<b.length;j++)
			{
				if (b[i]==b[j])
				{
					System.out.println(b[j]);
				}
				
				
			}
			
		}
		
		
		
	}
}
