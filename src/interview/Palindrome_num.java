package interview;

public class Palindrome_num {
	
		public static void main(String[] args)
		{
			int num=50045;
			int rem;
			int rev=0;
			int temp=num;
			
			while (temp>0)
			{
				rem=temp%10;
				rev=rev*10+rem;
				temp=temp/10;
			}
			
			System.out.println("reverse Number :" + rev);
			
			if (num == rev)
			{
				System.out.println("Palindrome Number");
			}
			else
			{
				System.out.println("not a palindrome Number");
			}
			
		}
}
