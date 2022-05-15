package regular_program;


public class This_Keyword {

// introduction ___________________________

//	This_Keyword()
//	 {
//		 this("mango");
//		 System.out.println("default constructor get called");
//	 }
//	
//	//we can call default constructor in the parameterized constructor,by using this keyword,also
//	//we can call parameterize constructor in the default constructor,by using this keyword.

//	
//	 This_Keyword(String fruit)
//	 {
//		 System.out.println("fruits are sweet");
//		 
//	 }
//	 
//	 public static void main(String[] args)
//	 {
//		 This_Keyword r=new This_Keyword();
//		 
//	 }
	 

	
	// 1st Program _____________________
	
//	 int a;
//	 This_Keyword(int a)
//	 {
//		 this.a=a;         //if we not used this here,jvm will confuse which a is this? local or parameterize..		 
//	 }
//	 
//	 public void show()
//	 {
//		 System.out.println("this is " + a);
//	 }
//	 
//	 public static void main(String[] args) {
//		 This_Keyword P=new This_Keyword(100);
//		 P.show();
//		 
//	}

	 
//	2nd Program _________ we can call the method inside of a constructor
	
//	public void test()
//	 {
//		 System.out.println("this is test method");
//	 }
//	
//	 This_Keyword()
//	 {
//		 this.test();           //here we call the test method inside constructor
//		 System.out.println("default constructor get called");
//	 }
//	
//	 This_Keyword(String fruit)
//	 {
//		 this.test();
//		 System.out.println("fruits are sweet");
//		 
//	 }
//	 
//	 public static void main(String[] args)
//	 {
//		 This_Keyword obj=new This_Keyword();
//		 obj.test();
//	 }

	
//3rd Program _______ we can call another method inside of a method.by using this 
	
	 public void mango()
	 {
		 System.out.println("mango is sweet fruit");
	 }
	 
	 public void apple()
	 {
		 this.mango();
		 System.out.println("apple is healthy fruit");
	 }
	 
	 
	 public static void main(String[] args)
	 {
		 This_Keyword obj=new This_Keyword();
		 obj.apple();
	 }

	
	 
}
