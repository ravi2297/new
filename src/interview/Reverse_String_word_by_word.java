package interview;

public class Reverse_String_word_by_word {

	
	public static void main(String[] args) 
	{
		String str="my name is Ravi";
		
		String[] a=str.split(" ");
		
		System.out.println(a.length);
		
		for (int i=a.length;i>0;i--)
		{
			System.out.print(a[i-1] + " ");
		}
		
	}
}
