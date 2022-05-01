package interview;

import java.util.Scanner;

public class Reverse_StringBuffer {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter state Name : ");
		
		String state=sc.nextLine();
		
		//By using StringBuffer class we can reverse int or string values.

		
		StringBuffer sb=new StringBuffer();
		sb.append(state);
		
		StringBuffer rev=sb.reverse();
		
		System.out.println("this is reverse name of the state : " + rev);
		
		
		
		
		
	}
}
