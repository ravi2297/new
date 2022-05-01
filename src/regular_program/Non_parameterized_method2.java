package regular_program;

public class Non_parameterized_method2 {

	int a=50;
	
	static int b=25;
	
	
	public static void substraction() {   // this is non parameterized static method.
		
		int c=65;
		int d=36;
		int e=c-d;
		System.out.println(e);
		
		
	}
	
	public static void main(String[] args) {
		
		Non_parameterized_method2 obj=new Non_parameterized_method2();
		
		obj.substraction();
		
		Non_parameterized_method2.substraction();
		
		substraction();
		
		
		


	}
	
}
