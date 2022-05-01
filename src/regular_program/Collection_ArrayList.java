package regular_program;

import java.util.ArrayList;

public class Collection_ArrayList {
	
	// ArrayList in Collection.
	
	public static void main(String[] args)
	
	{
		ArrayList<String> color=new ArrayList<String>();
		
		color.add("Blue");
		color.add("red");
		color.add("Orange");
		color.add("purple");
		color.add("pink");
		
		System.out.println(color.set(3,"black"));  //change element.
		System.out.println(color);
		
		System.out.println(color.remove(1));   // remove element.
		
		System.out.println(color);
		
		
		System.out.println(color.get(2));     //get method in ArrayList.
											  //to get individual element.
		
		
	}

}
