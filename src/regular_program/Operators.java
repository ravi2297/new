package regular_program;

public class Operators {
	
	public static void main(String[] args) {
		
		int aa=100;
		int bb=25;
		
		// These are the arithmetical operators. ( + , - , * , / )	
		
		System.out.println(aa + bb);
		System.out.println(bb - aa);
		System.out.println(bb * aa);
		System.out.println(aa / bb);
		System.out.println("\n");
		
		int abc=52;
		int xyz=22;
		
		// these are the Relational operators. ( < , > , != , == )
		
		System.out.println(abc>xyz);
		System.out.println(abc<xyz);
		System.out.println(abc!=xyz);
		System.out.println(abc==xyz);
		System.out.println(" ");
		
		// we have 2 logical operators. ( & , | )
		// & (and) operators will give true, when both values are true.
		// | (or)  operators will give true, when atleast one value out of two is true. 
	
	boolean x=true;
	boolean y=false;
	System.out.println(x & y);
	
	boolean a=false;
	boolean b=true;
	System.out.println(a | b);
	
	}
	

}
