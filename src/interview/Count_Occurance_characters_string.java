package interview;

public class Count_Occurance_characters_string {

	public static void main(String[] args)
	{
		
		String text="java is easy";
		int beforeRemove=text.length();
		System.out.println(text);
		//first Approach____________________________
		//suppose we have to find out how many times a is occured in String..
		
		String newText=text.replace("a","");
		
		System.out.println(newText);
		int afterRemove=newText.length();
		
		int occurance = beforeRemove - afterRemove;
		
		System.out.println("occurance of character a :" + occurance);
	
//________________________________________________________________________________________________
		int count=0;
		char ch='a';
		
		for (int i=0;i<text.length();i++)
		
		{
		
		if(text.charAt(i)==ch)
			{
				count++;
			}
			
		}
		System.out.println("a is occurs" + count + " times");

//_________________________________________________________________________________________________
		
		String name="java code";
		
		char[] p=name.toCharArray();
		for(int i=0;i<p.length;i++)
		{
			
			int cont=1;
			for(int j=i+1;j<p.length;j++)
			{
				if (p[i] == p[j])
				{
					cont++;
				}
			}
			
			System.out.println("the occurence of "+p[i]+ " is :" + cont);
			
			
			
		}
		
		
	}
}
