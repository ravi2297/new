package exception_handling;

import java.util.TreeSet;

public class Try_and_catch {

			public static void main(String[] args)
			{
				TreeSet data=new TreeSet();
				
		//try block get executed,if there is no exception.
				try {
					data.add("sagar");
					data.add("ravi");
					data.add("jack");
					data.add("drake");
					data.add("bob");
					data.add("matt");
					data.add(23);
				}
				
		//catch block get executed,if there is exception
		//here exception is parent,always provide parent,and "e" is reference variable.
				catch(Throwable e)
				{
					System.out.println("catch block will exectuted,because there is exception");
				}
		//remember catch body is exception handler.	
					System.out.println(data);
				
			}
}
