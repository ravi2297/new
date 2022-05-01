package interview;

public class Swap_number_without_using_3rd_variable {

	public static void main(String[] args)
	{
		
		int a=50;
		int b=100;
		
		System.out.println("before swapping :" + a + " " + b);
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("after swapping :" + a + " " + b);

	}
}
