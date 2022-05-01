package interview;

public class Fibonacci_series {
	
	public static void main(String[] args)
	{
			int firstNum = 0;
			int secondNum = 1;
			int series = 0;
			int num = 10;
			
		System.out.println("fibonacci series");
		
			for (int i=0;i<num;i++)
			{
				series = firstNum + secondNum;
				System.out.print(series + " ");
				firstNum = secondNum;
				secondNum = series;
			}
		
	}
}
