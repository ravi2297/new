package inheritance;

    public class Flipkart extends Amazon
{
	public static int openBrowser() {
		System.out.println("browser  opened.");
		return 32;
	}
	
	protected void openApp() {
		System.out.println("open Flipkart App.");
	}
	
	public void closeApp() {
		System.out.println("close Flipkart App.");
	}
	
	public static void main(String[] args) {
		
	Flipkart obj=new Flipkart();
	obj.openBrowser();
	obj.openApp();
	}
	
}
	

