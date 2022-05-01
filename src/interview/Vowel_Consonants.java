package interview;
import java.util.Scanner;
public class Vowel_Consonants {
	
	public static void main(String[] args) {
		
	
	Scanner input=new Scanner(System.in);
	System.out.println("Enter character");
	char data=input.next().charAt(0);
	input.close();
	
	if ( data == 'a' || data == 'e' || data == 'i' || data == 'o' || data == 'u') {
		System.out.println(data + " is vowel");
	}
	
	else {
		System.out.println(data +  " is consonants.");
	}
	}
}
