package abstraction;

public class Cat extends Animal  {
          // inherit from Animal.
	
	public void eat() {
		System.out.println("cat eating.");
	}

	
	public int run(int a) {
		System.out.println("Cat is running.");
		return 0;
	}	
	
	public void sleep() {
		System.out.println("Cat is sleeping.");
	}
	
}
