package regular_program;

public class Finalize_method_explain {

	
   
	
	public static void main(String[] args)
	{
		
		Finalize_method_explain obj=new Finalize_method_explain();
		
		obj=null;
		
		System.gc();
		System.out.println("done..garbage collector destroyed the obj");
	
	}
	
	 protected void finalize() throws Throwable 
	 	{
	        System.out.println("before garbage collector destroy the object,lets do some operation here");
	    }
}
