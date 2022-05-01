package polymorphism;

public class Task1 {

	// open browser.
	
	protected static void exercise(String a) {
		String name=a;
		System.out.println("my name is " + name +" i will do exercise. ");
	}
	
	public static void exercise(int b,String a) {
		System.out.println("ok");
	}
	
	public Task1(float a) {
		System.out.println("hello");
	}
	
	Task1(String a) {
		System.out.println("How are you? ");
	}
	
	public static void main(String[] args) {
		exercise("ravi");
		exercise(2,"k");
		Task1 abc=new Task1(44.45f);
		Task1 obj=new Task1("ok");
		
		
		
	}
}
