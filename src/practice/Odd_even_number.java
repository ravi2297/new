package practice;

import java.util.Scanner;

public class Odd_even_number {
	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		System.out.println("Enter Number: ");
		int data=input.nextInt();
		input.close();
		
	if (data % 2 == 0)
	{
		System.out.println(data + " is even Number.");
	}
	else 
	{
		System.out.println(data + " is odd Number.");
	}
	input.close();	
		
		
	}
}
