package regular_program;

public class Call_variable {
	
	
	
	int a=40;
	
	static int b=40000;
	
	public void Demo() {
		String text="Hello World ";
		System.out.println(text);
	}
	
	
	public static void main(String[] args) {
		
		Call_variable obj=new Call_variable();
		System.out.println(obj.a);
		
		
		System.out.println(obj.b);
		System.out.println(Call_variable.b);
		System.out.println(b);
		
		obj.Demo();
		
	}

}
