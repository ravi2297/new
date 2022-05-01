package regular_program;

import java.util.ArrayList;
import java.util.LinkedList;

public class Collection_LinkedList {

	public static void main(String[] args)
	{
		
		LinkedList<String> name=new LinkedList<String>();
		
		name.add("bob");
		name.add("julia");
		name.add("piu");
		name.add("hinata");
		name.add("eren");
		
		System.out.println(name);
		
		name.addFirst("mikasa");
		System.out.println(name);
		
		name.addLast("Armin");
		System.out.println(name);
		
		name.removeFirst();
		System.out.println(name);
		
		name.removeLast();
		System.out.println(name);
	}
	
}
