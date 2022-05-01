package regular_program;

public class Call_variable_from_another_class {

	public static void main(String[] args) {
		
		// we call instance variable from (call variable) class file.
		
		Call_variable apple=new Call_variable();
		System.out.println(apple.a);
		
		// here we call static variable from (call_variable) class file.
		
		System.out.println(apple.b);
		System.out.println(Call_variable.b);
		
		//here direct calling is not possible in static variable
		
		apple.Demo();
		
		Non_parameterized_method obj=new Non_parameterized_method();
		obj.addition();
		
	}	
}
