package regular_program;

public class Non_parameterized_method {
	
	String name="hello there";
			
	static float f=20.45f;
	
	
	
	public void addition() {       // this is Non parameterized non-static method.
		
		int a=22;
		int b=28;
		int c=a+b;
		System.out.println(c);
	
	}
	
	public static void main(String[] args) {
		
		Non_parameterized_method obj=new Non_parameterized_method();
		
		obj.addition();
	}
	
}