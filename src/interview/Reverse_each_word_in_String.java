package interview;

public class Reverse_each_word_in_String {

	public static void main(String[] args)
	{
		String name = "Pooja Rajendra Sonavane";
	
		String a[]= name.split(" ");
		
		
		for(String word: a)
		{
			String reverse= " ";
			
			for(int i= word.length()-1;i>=0;i--)
				{
					reverse=reverse+ word.charAt(i);
				}
			
				System.out.print(reverse +" ");
				
		}
			}
}
