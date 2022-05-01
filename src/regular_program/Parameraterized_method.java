package regular_program;

public class Parameraterized_method {
	
	// i want 5 student "name" and "age".
	
	// this is Parameraterized Non-static method.
	
	public void StudentInfo(String a,int b) {
		
		String name=a;
		int age=b;
		
		System.out.println("Name : " + name + " Age : " + age);	
	}
	
	public void Favourite_colour(String c,String d) {
		
		String Name=c;
		String Fav_colour=d;
		
		System.out.println("My Name is " + Name + " and my favourite colour is " + Fav_colour );	
	}

	public void IT_salary(String a,String b,int c) {
		 
		String name=a;
		String role=b;
		int salary=c;
		
		System.out.println("Hello,myself " + name + " I'm a "+ role + " and my monthly salary is " + salary + ". ");	
	}
	
	public static void main(String[] args) {
		
	Parameraterized_method obj=new Parameraterized_method();
	obj.StudentInfo("rahul", 24);
	obj.StudentInfo("rahulbhai", 25);
	System.out.println();
	
	obj.Favourite_colour("Ravi", "Purple");
	obj.Favourite_colour("Anket","Pink");
	obj.Favourite_colour("Sanket", "Blue");
	System.out.println();

	
	obj.IT_salary("rahul","Software Engg", 55000);
	obj.IT_salary("Amir", "Cloud Engineer", 70000);
	obj.IT_salary("Pooja", "Quality Analyst", 40000);
	System.out.println();

	}
}
