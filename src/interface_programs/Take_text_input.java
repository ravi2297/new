package interface_programs;
import java.util.Scanner;
public class Take_text_input {
	
	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter Your Name: ");
		
		String data=input.nextLine();
		
		System.out.println("Enter your age: ");
		
		int age=input.nextInt();
		
		System.out.println("hey " +  data +  ", welcome to india.....! ");
		
		input.close();
		
		System.out.println("hello " + data + " Your age is : " + age);
		
		
	}

}
