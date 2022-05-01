package regular_program;

import java.util.Scanner;
public class Nested_if {
	
	public static void main(String[] args)
	{
		
		Scanner input=new Scanner(System.in);
		System.out.println("Enter an age: ");
		int age=input.nextInt();
		
		Scanner ok=new Scanner(System.in);
		System.out.println("Enter an weight: ");
		int weight=ok.nextInt();
		
		Scanner bye=new Scanner(System.in);
		System.out.println("Enter an Height: ");
		int height=bye.nextInt();
		
		
		
		if (age>=18)
		{			
			if (weight>=45)
			{
				if (height>=160)
				{
					System.out.println("Congradulation,you are eligible to join indian army.");
				}
				else
				{
					System.out.println("Not eligible to join indian army,because weight is low.");
				}
			}
			else
			{
				System.out.println("Not eligible to join indian army,because weight is low.");
			}
			
			
		}
		else
		{
			System.out.println("Not eligible to join indian army, because age is low.");
		}
		
	}

}
