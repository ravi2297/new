package regular_program;

import java.util.Scanner;

public class Addition {
	public static void main(String[] args)
	{
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter first No :");
		int first=input.nextInt();
		
		System.out.println("Enter second No :");
		int second=input.nextInt();
		
		int addition=first + second;
		
		System.out.println("the addition is : "+ addition);
	
	}

}
