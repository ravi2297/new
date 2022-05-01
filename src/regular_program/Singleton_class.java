package regular_program;

public class Singleton_class {

	private static Singleton_class instance;
	public String text;
	
	private Singleton_class()
	{
		text ="welcome to java...";
	}
	
	public static Singleton_class getInstance()
	{
		if (instance == null)
		{
			instance =new Singleton_class();
		}
		return instance;
	}
	
	public static void main(String[] args)
	{
		Singleton_class obj=Singleton_class.getInstance();
		
		System.out.println(Singleton_class.getInstance().hashCode());
		System.out.println(Singleton_class.getInstance().hashCode());
		
	}
}
