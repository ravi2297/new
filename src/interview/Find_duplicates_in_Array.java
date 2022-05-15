package interview;

public class Find_duplicates_in_Array {

	public static void main(String[] args)
	{

		//check duplicates and unique in Array
		
		int[] num= {12,40,34,40,56,12,83,100};
		
		boolean repeat=false;
		System.out.println("duplicate numbers are : ");
		for (int i=0;i<num.length;i++)
		{
			for(int j=i+1;j<num.length;j++)
			{
				if(num[i] == num[j])
				{
					System.out.println(num[i]+" ");
				}

				
			}
			
		}	
		
	}
	
}
