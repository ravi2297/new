package regular_program;

public class Return_type {
	
	// return type in java.
	
	public Return_type test()
	{
		Return_type obj=new Return_type();
		return obj;
	}
	
	public boolean test8()
	{
		return true;
	}
	public static String name(String a,int b)
	{
		String name=a;
		int age=b;
		String c="student name is " +  name + " and his age is " + age;
		
		return c;
		
	}
	
	public static void main(String[] args)
	{
		Return_type obj=new Return_type();
		System.out.println(obj.name("ravi",24));
		
		System.out.println(Return_type.name("kirti",22));
		
		System.out.println(name("akash",45));
		
		System.out.println(obj.test());
		System.out.println(obj.test8());
	}
	
	
	}
