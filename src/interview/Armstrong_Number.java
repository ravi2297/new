package interview;

import java.util.Scanner;

public class Armstrong_Number {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any Number : ");
		int inputNumber =sc.nextInt();
		sc.close();
		
		int rem;
		int arm=0;
		int temp=inputNumber;         // we are passing temp value to it...
		
		while (temp != 0)
		{
			rem=temp % 10;
			arm=(rem*rem*rem) + arm;
			temp=temp/10;
			
		}
		if (inputNumber == arm)
		{
			System.out.println("Armstrong Number");
		}
		
		else
		{
			System.out.println("Not an Armstrong Number.");
		}
		
	}
}
