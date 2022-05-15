package interview;

public class find_duplicate_word_String {
	
	public static void main(String[] args)
	{
		String text="sun is hot and sun is big";
		
		String[] words=text.split(" ");
		int count=0;
		
		System.out.println("duplicate words are :");
		
		for (int i=0;i<words.length;i++)
		{
			for (int j=i+1;j<words.length;j++)
			{
				if(words[i].equals(words[j]))
				{
					System.out.println(words[j]);
					count++;
				}
			}
			
		}
		
		
		System.out.println("here "+ count + " words are duplicate.");
				
			
			
			
		
	}
}
