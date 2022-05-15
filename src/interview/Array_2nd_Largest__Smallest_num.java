package interview;

import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

public class Array_2nd_Largest__Smallest_num {
	
	public static void main(String[] args)
	{
	// this is best and working 100% trick to find out 2nd highest/lowest no from array.
	
	// approach 1 : By Collction... find 2nd Largest...
		
		int[] a= {12,34,43,53,22,9};
		
		TreeSet<Integer> ts=new TreeSet<Integer>();
		
		for (int e:a)
		{
			ts.add(e);
			
		}
		ts.remove(ts.last());
		System.out.println(ts.last());
		
	// approach 2 : Preferable ____2nd Highest Number from Array....
		
		int High1=Integer.MIN_VALUE;
		int High2=Integer.MIN_VALUE;
		
		for (int i=0;i<a.length;i++)
		{
			if (High1<a[i])
			{
				High2=High1;
				High1=a[i];
				
			}
			
			else if (a[i]<High1 && a[i]>High2)
			{
				High2=a[i];
			}
			
		}
		System.out.println("the 2nd Highest Number from array :" + High2);
	
		
	//  Approach 3 : 2nd Lowest Number from an array.....
		
		int Low1=Integer.MAX_VALUE;
		int Low2=Integer.MAX_VALUE;
		
		for (int i=0;i<a.length;i++)
		{
			if (a[i]<Low1)
			{
				Low2=Low1;
				Low1=a[i];
			}
			
			else if (a[i]>Low1 && a[i]<Low2)
			{
				Low2=a[i];
			}
			
		}
		
		System.out.println("2nd Lowest number from an array :" + Low2);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

		
		
		
	}
}
