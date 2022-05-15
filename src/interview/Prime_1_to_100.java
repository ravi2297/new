package interview;

public class Prime_1_to_100 {

	public static void main(String[] args)
	{
		System.out.println("prime numbers between 1 to 100 : ");
		System.out.println();
		
		for (int i=1;i<=100;i++)
		{
			int count=0;   //always mention count here...
			for (int j=1;j<=i;j++)
			{
				if (i%j == 0)
				{
					count++;
				}
			}
			
			if (count == 2)
			{
				System.out.print(i + " ");
			}
			
			
		}
		
		
	}
}
