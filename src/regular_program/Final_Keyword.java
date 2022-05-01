package regular_program;


 
public class Final_Keyword {

	final int a=45;
	// final keyword is modifier,which provide restriction.
	
	// final variable = we cannot re-assigned this variable.
	// ex final int a=23; we cannot make int a=45;
	
	void test()
	{
		System.out.println("privacy lose here");
	}
	
	public static void main(String[] args)
	{
		Final_Keyword obj=new Final_Keyword();
		System.out.println(obj.a);
		
	}
}


 