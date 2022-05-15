package interview;

public class First_Non_repeated_character_string {

	public static void main(String[] args)
	{
	
	String name="java cjode";
	char[] ch=name.toCharArray();
	
	for (int i=0;i<ch.length;i++)
	{
		int count=0;
		for(int j=i+1;j<ch.length;j++)
		{
			if (ch[i]==ch[j])
			{
				count++;
				break;
				
			}
		
		}
		if (count == 0)
		{
			System.out.println(ch[i]);
			break;
		}
	}
	
	}
}
