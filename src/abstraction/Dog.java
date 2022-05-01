package abstraction;


public class Dog extends Animal
{
	
	public void walk()
	{
		System.out.println("Dog is walking.");
	}
	
	public void run() 
	{
		System.out.println("Dog is running.");
	}
	
	public static void main(String[] args) {
		Dog obj=new Dog();
		obj.walk();
		obj.run();
	}

	@Override
	public void eat() {
		
	}

	@Override
	public int run(int a) {
		return 0;
	}
}
