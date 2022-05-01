package regular_program;

public class ConstructorCopy {

	private static final String names = null;
	String name;
	ConstructorCopy(String names)
	{
		name=names;
		System.out.println("default constructor get called.");
	}
	
	ConstructorCopy(ConstructorCopy e)
	{
		name=e.names;
		
	}
	
}
