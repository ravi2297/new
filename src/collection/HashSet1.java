package collection;

import java.util.HashSet;
import java.util.Iterator;


public class HashSet1 {
		
	public static void main(String[] args)
	{
		HashSet<Object> cars=new HashSet<Object>();
		
			cars.add("bmw");
			cars.add("tata");
			cars.add("Audi");
			cars.add("ford");
			cars.add("lamborgini");
		
	// HashSet Provide random output.because Set doesn't maintain index.
			
			cars.remove("tata");
			cars.contains("ford");
			System.out.println(cars.size());
			System.out.println(cars);
			
			Iterator<Object> ok=cars.iterator();
			
			System.out.println(ok.next());
			System.out.println(ok.next());
			
		
		
	}
}
