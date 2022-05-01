package exception_handling;

public class Throw_and_throws_keywords {
	
	
	public static void checkAge(int age) throws Exception
	{
	
		if (age>18)
		{
		throw new Exception("you are more than 18 years old.");
		}
		else {
			System.out.println("age is not perfect.");
		}
		
	//throw statement allow you to create custom error.
	}
	
	public static void main(String[] args) throws Exception
	{
		checkAge(23);
	}
	
	//throws keyword we give chance to caller method to handle this Exception.
	
}
