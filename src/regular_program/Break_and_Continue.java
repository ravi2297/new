package regular_program;

public class Break_and_Continue {

	public static void main(String[] args)
	{
//		for (int i=0;i<=10;i++)
//		{
//			if (i == 4)
//			{
//				System.out.println("no further iteration,due to break");
//				break;
//			}
//			System.out.println(i);
//		}
//		
//		System.out.println("break statement did it ..!");
		
		for (int i=3;i<=30;i++)
		{
			if (i%3 != 0)
			{
				continue;
			}
			System.out.println(i);
		}
		
	}
}
