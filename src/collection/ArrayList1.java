package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayList1 {
	public static void main(String[] args) {
		
		ArrayList<Integer> a=new ArrayList<Integer>();
		// by using datatype Object we can pass any type of values.
					a.add(12);
					a.add(32);
					a.add(43);
					a.add(32);
		/*			
		System.out.println(a.get(2));
		System.out.println(a);
		System.out.println(a.isEmpty());
		*/
		int b=a.size();           //this method return no.of elements.
		System.out.println(b);
		System.out.println(a.get(2));
		
		Collections.sort(a);
		//this is collections class and sort method used for printing elements in alphabetical or numeric orders.
		// but type should not be object.
		for (Object i:a) 
		{
			System.out.println(i);
		}
		
		Iterator<Integer> it=a.iterator();
		System.out.println(it.next());
		
	}
	

}
