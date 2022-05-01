package regular_program;

public class Variable_types {
	
	String name="Ravi";   // 1. This is instance Variable.
	            // 2. A variable declared inside the class but outside the body of the method, 
	            //    without static keyword is called "instance variable".
				//  By ( using object reference ) we can access instance variable.
	
	
	
	
	static int b=500000; // static variable is declared within the class directly with the static modifier
					   // but outside of any method.
	
	
	
	
	public void test() 
	{
		
		int abc=34;						 // this is local variable.
		   								// local variable always declared in method.
		System.out.println(abc);		// you can only use this variable inside this method,
										// other methods in the class aren't even aware that the variable exist.
										
										
		
	}
	
	
	
	
	public static void main(String[] args) 
	{
		
		float z=234.43f;               // this is local variable.
									   // local variable always declared in method.
										
		// you can only use this variable inside this method,other methods in the class aren't even aware that 
		// the variable exist.
		
		Variable_types obj=new Variable_types();  
		
		System.out.println(obj.name);               // here we call the instance variable with object reference.
	
		System.out.println(obj.b);         // here we (call the static variable with object reference.)
		
	    System.out.println(Substraction.p); // here we call the static variable by class reference.
											// we call x variable from another class file,
											// from Substraction.java file. cool is it?
		
		System.out.println(b);              // here we call static variable directly(use this if variable 
											// is in same class.)
		System.out.println();
		obj.test();							// here we call the local variable from user defined test method.
	}
		
}
