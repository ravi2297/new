package regular_program;

public class Ternary_operator {
		public static void main(String[] args)
		{
			int a=32;
			int b=87;
			
			
			int maxNumber = (a>b) ? a : b;
			
			System.out.println("the largest Number is :" + maxNumber);
			
			
			int x=39;
			int y=67;
			int z=90;
			
			int largeNum= (x>y) ? (x>z ? x:z) : (y>z ? y:z);
			
			System.out.println(largeNum);
			
			
			
			
			
		}
}
