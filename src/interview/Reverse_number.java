package interview;

import java.util.Scanner;

public class Reverse_number {
	
	public static void main(String[] args)
	{
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter NO: ");
		int num=sc.nextInt();
		
		StringBuffer sb=new StringBuffer(String.valueOf(num));
		
		StringBuffer rev=sb.reverse();
		
		System.out.println("this is reverse Number : " + rev);
		
		
		
	}
	
	
	
}
