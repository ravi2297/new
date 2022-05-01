package polymorphism;

public class Flipkart {
	
	public void openbrowser() {
		System.out.println("Browser opened successfully.");
	}
	
	protected void openApplication(String a) {
		
		System.out.println("http://www.flipkart.com");
	}
	
		// static method
	public static void closeApplication(String b) {
		System.out.println("flipkart app closed.");
	}
	
	
	
	public static void main(String[] args) {
		Flipkart abc=new Flipkart();
		abc.openbrowser();
		abc.openApplication("king");
	}

}
