package regular_program;

public class ConstructorCopy {

	String name;
	ConstructorCopy(String names)
	{
		name=names;
	}
	
	ConstructorCopy(ConstructorCopy e)
	{
		name=e.name;
		
	}
	
	public void display()
	{
		System.out.println("this is display "+name);
	}
	
	public static void main(String[] args) {
		ConstructorCopy obj=new ConstructorCopy("mango");
		ConstructorCopy obj1=new ConstructorCopy(obj);
		obj.display();
		obj1.display();
		
	}
	
}
