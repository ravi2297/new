package interview;

public class Array_Find_unique {

	public static void main(String[] args)
	{

		int[] a={2,4,3,2};
		for(int i=0;i<a.length;i++)
		{int count=0;
			for(int j=0;j<a.length;j++)
			{
			if (a[i]==a[j])
			{
				count++;
			}
				
			}
			if(count==1)
			{
			System.out.print(a[i] + " ");
			}
		}
	
	}
}
