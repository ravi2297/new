package interview;

import java.util.Scanner;

public class Reverse_Stringbuilder {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter name : ");
		
		String name=sc.nextLine();
		
		//By using StringBuilder class we can reverse int or string values.
		
		StringBuilder sb=new StringBuilder();
		sb.append(name);
		
		StringBuilder rev=sb.reverse();
		
		System.out.println("this is reverse text : " + rev);
		
		
		
		
		
		
	}
}
