package polymorphism;

public class Task2 extends Task1
{

	
	public Task2(float a) {
		super(a);
		// TODO Auto-generated constructor stub
	}



	public void exercise(String a,int b) {
		String name=a;
		System.out.println("my name is " + name +" i will do exercise. ");
	}
	
	
	
	// Constructor over loading is not possible due to inheritance.it shows error.
	
	public static void main(String[] args) {
		
		Task2 oki=new Task2(12.6f);
		oki.exercise("anamika",33);
		exercise("ikk");		
		
		
	}
}
