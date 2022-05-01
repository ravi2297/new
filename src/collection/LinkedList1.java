package collection;

import java.util.LinkedList;

public class LinkedList1 {
	
				
			public static void main(String[] args)
			{
			
				LinkedList<Object> a=new LinkedList<Object>();
					a.add("tiger");
					a.add(true);
					a.add(true);
					a.add(32);
					a.add(32.32);
	
							
					System.out.println(a.get(3));
					/* for (Object i:a)
					{
						System.out.println(i);
					} */
							
							
			}
}
