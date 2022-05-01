package interview;

public class Count_even_odd_in_number {

	public static void main(String[] args)
	{
		int num=20392;
		int temp=num;
		int rem;
		int checkOdd=0;
		int checkeven=0;
		
		while(temp>0)
		{
			rem=temp%10;
			
			if (rem%2 == 0)
			{
				checkeven++;
			}
			
			else
			{
				checkOdd++;
			}
			temp=temp/10;
		}
		System.out.println("odd numbers are :" + checkOdd);
		System.out.println("even numbers are :" + checkeven);

	}
}
