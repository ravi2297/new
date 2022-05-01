package interview;

public class Split_string {

	public static void main(String[] args)
	{
		String name="Welcome to Java";
		
		String[] a=name.split(" ");
		
		for (String e:a)
		{
			System.out.println (e);
		}
		
	}
}
