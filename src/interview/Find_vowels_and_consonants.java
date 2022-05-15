package interview;

public class Find_vowels_and_consonants {
	public static void main(String[] args)
	{
		
	String name="java code";
	
	//separate vowels and consonants from string
	
	char[] a=name.toCharArray();
	
	for(int i=0;i<a.length;i++)
	{
		if(a[i] == 'a' || a[i] == 'e' || a[i] == 'i' || a[i] == 'o' || a[i] == 'u')
		{
			//System.out.println(a[i]);    //to find vowels remove comment 
		}
		
		else
		{
			System.out.println(a[i]);      //to find consonants execute this 
		}
	}
	
	
	}
}
