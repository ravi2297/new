package polymorphism;

public class Amazon extends Flipkart {
	
	public void openbrowser() {
		System.out.println("Browser opened successfully. d");
	}
	
	

	public void openApplication(String a) {
		System.out.println("http://www.amazon.com");
	}
	
	
	  // static method
	public static void closeApplication(String b) {
		System.out.println("Amazon app closed.");
	}
	
	
	
	public static void main(String[] args) {
		Amazon abc=new Amazon();
		abc.openbrowser();
		abc.openApplication("k");
		abc.closeApplication("k");
	}
}
