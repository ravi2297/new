package collection;

import java.util.LinkedHashSet;

public class LinkedHashSet_2 {
	
	public static void main(String[] args)
	{
		LinkedHashSet<Object> sub=new LinkedHashSet<Object>();
		
		sub.add("Physics");
		sub.add("Maths");
		sub.add("marathi");
		sub.add("Biology");
		sub.add("chemistry");
		
		// LinkedHashSet gives output as per insertion order.
		
		System.out.println(sub.contains("Biology"));
		System.out.println(sub.size());
		System.out.println(sub);
		
		
		
	}

}
