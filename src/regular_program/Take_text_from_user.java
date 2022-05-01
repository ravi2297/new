package regular_program;

import java.util.Scanner;

public class Take_text_from_user {
	
	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("What is your name? : ");
		String data=input.nextLine();
		
		System.out.println("Age: ");
		int a=input.nextInt();
		
	    System.out.println("My B.E Percentage are: ");
	    double abc=input.nextDouble();
	    
		System.out.println("My Name is " + data + " and my age is " + a + ", I have a " + abc + " % in My Engineering Final Year.");
		
		input.close();
		
	}
}

 