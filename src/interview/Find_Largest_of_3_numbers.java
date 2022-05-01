package interview;

public class Find_Largest_of_3_numbers {

		public static void main(String[] args)
		{
			
			int a=30;
			int b=200;
			int c=1000;
			
			int large=(a>b)?a:b;
			
			int large1=(large>c)?large:c;
			
			System.out.println("large no : " + large1);
		}
}
