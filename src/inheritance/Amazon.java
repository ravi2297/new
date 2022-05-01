package inheritance;

public class Amazon extends Facebook
{
	//static method cannot be override.
	
	public static int openBrowser() {
		System.out.println("browser opened.");
		return 32;
	}
	
	protected void openApp() {
		System.out.println("open Amazon App.");
	}
	
	public void closeApp() {
		System.out.println("close facebook App.");
	}
	
	public static void main(String[] args) {
		Amazon obj=new Amazon();
		obj.openBrowser();
	}
	
	
}