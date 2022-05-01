package interview;

public class Count_sum_of_digits_in_number {
	public static void main(String[] args)
	{
		int num=12345;
		int temp=num;
		int rem;
		int count=0;
		
		while(temp>0)
		{
			rem=temp%10;
			
			count=count+rem;
			
			temp=temp/10;
		}
		System.out.println(count);
		
		
		
	}
}
