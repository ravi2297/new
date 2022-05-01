package regular_program;

import java.util.Scanner;

public class Take_double_from_user {
	
	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		System.out.println("What is the current temperature in your city? : ");
		
		double data=input.nextDouble();
		System.out.println("The temperature is :" + data);
		
		input.close();
		
	}

}
