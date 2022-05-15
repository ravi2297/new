package interview;

public class Print_1_to_10_without_for_loop {

	public static void printNum(int n)
	{
		if (n<=100)
		{
			System.out.println(n);
			printNum(n+1);
		}
		
	}
	
	
	public static void main(String[] args)
	{
		printNum(1);
		
		
	}
	
}
