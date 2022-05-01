package interview;

public class Count_num_of_digit_in_num {
	public static void main(String[] args)
	{
		
		int num=2345;
		int temp=num;
		int count=0;
		int rem;
		
		while(temp>0)
		{
			rem=temp%10;
			
			if (rem!=0)
			{
				count++;
			}
			
			temp=temp/10;
		
		}
		System.out.println("the number of digits in numbers are :" + count);

	
	
	
	}
}