package regular_program;

public class String_method {
	
	public static void main(String[] args) {
		
		
		String text="Welcome to Java.";
		String input="Java is object oriented programming language.";
		String a="Cat is animal.";
		String b="Cat is Animal.";
		
		System.out.println(text.toLowerCase()); // Converts all of the characters in this String to lowercase 
		
		System.out.println(text.toUpperCase()); // Upper Case all letters.
		
		System.out.println(text.length());     //returns the length of string 
		System.out.println(text.charAt(6));    // returns the char value at specified index
		System.out.println(text.contains("to")); 
		System.out.println(text+input);
		System.out.println(text.concat(input));  // concat the strings
		char z=text.charAt(11);
		System.out.println(z);
		
		System.out.println(b.endsWith("."));
		System.out.println(a.startsWith("C"));
		
		System.out.println(a.equals(b));    // check String is equal to or not.
		System.out.println(a.equalsIgnoreCase(b));   //ignore case and check string is equal to or not.
		
		System.out.println(a.indexOf(5));
		System.out.println(a.replace('C', 'b'));
		System.out.println(a.concat(b));
		
	}
	

}
