package array;

public class Array_basics {

//	what is array?
	  
/* 	>> Array are used to store multiple values in a single variable.
	   instead of declaring separate variables for each values.
	   
	>> To declare an array define the variable type with "square brackets".
	   
	>> Syntax : variableType[] variableName= { values } 
	   
	 // String array.                    */
	   
	   
	   public static void test1() {
	   	   
	   			String[] name = {"ravi","kirti","pinky","suraj","amir"};
	   			
	   			
	   		 //  1. How to access the elements of an array?
	   		
	   		   
	  	      System.out.println(name[1]);
	  	      System.out.println("\n");
	  	      
	  	 //     output >> kirti (because here index starts from 0.   here length of array is 5, because,here values are 5.)
	  	      
	  	 //     array index = array length - 1 
	   			
	   }
	   		
	 //	integer array.
	   
	   
	   public static void test2() {
		   
		   		int[] age= {33,23,55,63,13};
		   		
        // 2. how to find out array length?
		   		System.out.println(age.length);
		   		System.out.println("\n");
	   }
	   
	   		    
	//  To use different data type values in single variable we must use Object datatype.
	   
	   public static void test3() {
		   
		   Object[] data= {32, 54.98f, "ravi", "pinky" ,true,false};
		   
		//   3. how to change an elements of an array?
		   
	 //	  if I want to add "shreya" instead of "pinky" then refer to the index number
		   
		 	  data[3]="shreya";
		 	  
		 	  for (Object a:data) 
		 	  {
		 	  System.out.println(a);  // here a called as an index.
		 	  }
	   }
	   
	   public static void main(String[] args) {
		   
		   test1();
		   test2();
		   test3();
	   }
	   
	 
	      
	 
	 	  
	 					
	 					
}
