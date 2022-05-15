package interview;

public class Separate_vowels_and_String {
	public static void main(String[] args)
	{
	String text="java code";
	
	//separate vowels and consonants from String 
	
	char[] ch=text.toCharArray();
	String vowels=" ";
	String consonants=" ";
	for (int i=0;i<ch.length;i++)
	{
		
		if (ch[i]=='a' || ch[i]=='e' || ch[i]=='i' || ch[i]=='o' || ch[i]=='u')
		{
			vowels=vowels+ch[i]+" ";
		}
		else 
		{
			consonants=consonants+ch[i]+" ";
		}
		
	}
		System.out.println("vowels are :" + vowels);
		System.out.print("consonants are :" + consonants);
	
	}
}
