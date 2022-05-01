package interview;

public class Palindrome_String {

	public static void main(String[] args)
	{
		String name="radar";
		String output="radar";
		
		for (int i=name.length();i>0;i--)
		{
			name.charAt(i-1);
		}
		
		if (name == output)
		{
			System.out.println(name + " is palindrome String");
		}
		
		else 
		{
			System.out.println(name + " is not a palindrome String");
		}
		
	}
}
