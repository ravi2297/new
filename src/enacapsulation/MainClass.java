package enacapsulation;

public class MainClass {
	static int a=45;
	
	public void test()
	{
		System.out.println(a);
	}
		
	public static void main(String[] args)
	{
		MainClass obj=new MainClass();
		obj.test();
	}
	
}
