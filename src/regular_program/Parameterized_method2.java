package regular_program;

public class Parameterized_method2 {

	
	//This is Parameterized Static method.
	
	public static void IPL(String a,String b,int c) {
		
	String Captain=a;
	String team=b;
	int numbers=c;
	
	System.out.println(Captain + " from " + team + " won " + numbers + " No. of IPL Tropy. ");		
	}
	
	public static void main(String[] args) {
		
		Parameterized_method2 input=new Parameterized_method2();
		input.IPL("MS Dhoni", "CSK", 3);
		input.IPL("rohit sharma", "MI", 4);
		input.IPL("Devid Warner", "SH", 1);         // by object reference.
		
		Parameterized_method2.IPL("Adam Gilchrist", "DC", 1);     // by class reference.
		
		IPL("Shane Warne","RR",1);                   // by direct method calling.
		
		Non_parameterized_method2 ok=new Non_parameterized_method2();
		ok.substraction();

	}
}
