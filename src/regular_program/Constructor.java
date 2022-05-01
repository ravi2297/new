package regular_program;

public class Constructor {
	
	public Constructor() {    //this is Non parameterized Constructor.
		
		int a=51;
		String b="Hey there,welcome to java.";
		System.out.println(b);
		
	}
	
	public Constructor(String a,int b) {     //parameterized Constructor.
		
		String name=a;
		int age=b;
		System.out.println(name + " " + age);
	}
	
	protected Constructor(String b) {
		
		String food=b;
		
		System.out.println("today i will eat " + food );
		
	}
	
	public static void main(String[] args) {
		
		Constructor obj=new Constructor();    // this is default Constructor.
		
		Constructor input=new Constructor("ravi", 15);
		Constructor ok=new Constructor("maggie");
		
		
	}

}
