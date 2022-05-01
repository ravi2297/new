package regular_program;

public class If_else_if {
	
	public static void main(String[] args) {
		int marks=92;
		if (marks<50) {
			System.out.println("Student is Fail.");
		}
		else if (marks>=50 && marks<75) {
			System.out.println("Student is Pass");
		}
		else if (marks>=75 && marks<90) {
			System.out.println("Student is Pass with First Class.");
		}
		else if (marks>=90 && marks<=100) {
			System.out.println("Student is Pass with First Class With Distinction");
		}
		else {
			System.out.println("Invalid details");
		}
	}

}
