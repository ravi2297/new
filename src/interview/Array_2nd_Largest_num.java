package interview;

import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

public class Array_2nd_Largest_num {
	
	public static void main(String[] args)
	{
	// this is best and working 100% trick to find out 2nd highest/lowest no from array.
	
	// approach 1 :
		
		int[] a= {12,34,43,53,22,9};
		
		TreeSet<Integer> ts=new TreeSet<Integer>();
		
		for (int e:a)
		{
			ts.add(e);
			
		}
		ts.remove(ts.first());
		System.out.println(ts.first());

		
		
		
	}
}
