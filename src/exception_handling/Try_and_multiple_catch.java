package exception_handling;

import java.util.ArrayList;

public class Try_and_multiple_catch {

	public static void main(String[] args) {
		
		try {
		int[] num= {2,4,6,8};
		System.out.println(num[10]);
		}
		
		/* so here multiple catch block.
		 * at a time only catch block is get executed.
		 */
		
		catch (NullPointerException b)
		{
			System.out.println("1st catch block executed.");
		}
		
		catch (ClassCastException k)
		{
			System.out.println("2nd catch block executed.");
		}
		
		catch(Throwable e){
			System.out.println("3rd catch block is executed.");
		}
		
		/*
		1. this is finally block,it always get executed,it doesn't matter there is 
		   exception or not.
		2. there must be try block or catch block should be prerequisite for the finally
	       block.
		
		*/
		
		finally {
			System.out.println("this is finally block");
		}
		
		
		
		
	}
	
}
