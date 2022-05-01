package interview;

public class Remove_White_spaces_in_String {

	public static void main(String[] args)
	{
		String s="java is easy";
		System.out.println("before removing white spaces :" + s);

		String s1=s.replaceAll("\\s", "");
		
		System.out.println("after removing white spaces :" + s1);
	}
}
