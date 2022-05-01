package interview;
import java.util.Scanner;
public class Prime {

		public static void main(String[] args) {
			
			//print output no is  prime or not .
		Scanner input=new Scanner(System.in);
		System.out.println("Enter Number : ");
		int num=input.nextInt();
		input.close();
		
		int count=0;
		
		for (int i=1;i<=num;i++)
		{
				if (num%i == 0 )
				{
					count++;
				}
		}
		
		if (count == 2) 
		{
			System.out.println(num + " is a Prime Number.");
		}
		
		else 
		{
			System.out.println(num + " is not a Prime Number");
		}
		
		
			
			
		}
}

