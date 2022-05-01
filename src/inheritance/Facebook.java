package inheritance;

public class Facebook 
{
	public static int openBrowser() {
		System.out.println("browser opened.");
		return 43;
	}
	
	protected void openApp() {
		System.out.println("open Facebook App.");
	}
	
	public void closeApp() {
		System.out.println("close facebook App.");
	}
	
	public static void main(String[] args) {
		
	}
}