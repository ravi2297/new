package collection;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSet_3 {
	
	public static void main(String[] args)
	{
		SortedSet<Integer> alpha=new TreeSet<Integer>();
		
				alpha.add(100);
				alpha.add(18);
				alpha.add(50);
				alpha.add(89);
				alpha.add(32);
				
		System.out.println(alpha.first()); //return the first small element.
		System.out.println(alpha.last());	//return the last element.
		System.out.println(alpha.remove(89)); //remove the given element.
		
		System.out.println(alpha.headSet(32));	
		//return the element from set,before the specified element.
		
		System.out.println(alpha.tailSet(32));
		//return the element from the set,after the specified element,including him.
		
		System.out.println(alpha.subSet(50, 100));
		//return the between between this two element including first value/element.
				
		System.out.println(alpha);
				
		// here SortedSet is Set interface,extends the TreeSet class.
		// if there is interface ,then there is no Object.(Keep in mind.)
		
	}

}
