package regular_program;

	import java.util.Scanner; /* 1) to use Scanner we must add the line at the begining of program.
								this import Scanner class inside our program. */
	
	public class Take_input_from_user {
		
		public static void main(String[] args) {
			
			/* 2) create object of Scanner
			input is an object of Scanner.which will be used to take input.
			The System.in specifies we will take input from the standard input(keyboard). */
			
			Scanner input=new Scanner(System.in);
			
			System.out.println("Enter an integer:");
			
			// 3) It takes integer input from the user and stores it to the data variable.
			
			int data=input.nextInt();
			
			System.out.println("Input Data: " + data);
			
			//4) close Scanner.
			input.close();
			
		}
		
		
		
	}
	
	


