package interview;

public class Array_max_min_number {

	public static void main(String[] args)
	{
		int[] a= {23,20,12,1, 43,24,54};
		
		int min=a[0];
		
		for(int i=1;i<=a.length-1;i++)
		{
			
			
			if (min > a[i])
			{
				min=a[i];
			}
			
			
			
		}
		System.out.println("min number in array is :" + min);
		
//		int[] arr= {22,34,54,644,3445,32,5003,2000};
//		
//		int max=arr[0];
//		
//		for (int i=1;i<arr.length-1;i++)
//		{
//			
//			if (max < arr[i])
//			{
//				max=arr[i];
//			}
//			
//		}
//		System.out.println("the max Number in array :" + max);

	}
}
