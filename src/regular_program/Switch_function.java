package regular_program;

public class Switch_function {

	public static void main(String[] args)
	{
		int day=6;
		
		String good = " is a good day.";
		String bad = " is a bad day";
		
		switch (day)
		{
		case 1:
			System.out.println("sunday" + good);
			break;
		case 2:
			System.out.println("monday" + bad);
			break;
		case 3:
			System.out.println("tuesday" + bad);
			break;
		case 4:
			System.out.println("wednesday" + bad);
			break;
		case 5:
			System.out.println("thursday" + bad);
			break;
		case 6:
			System.out.println("friday" + bad);
			break;
		case 7:
			System.out.println("saturday" + bad);
			break;
		default:
			System.out.println("provide correct day");
			
		}
		
	}
}
