package array_programs_using_Sorting_mechanism;

public class Sorting_array_in_DESC_order_and_printing_in_ASC_order 
{
	public static void main(String[] args) 
	{
		int[] a = {10,50,30,40,20};
		
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = i+1; j < a.length; j++) 
			{
				if (a[i]<a[j]) 
				{
					int temp = a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		
		System.out.println("printing in Ascending order");
		for (int i = a.length-1; i >=0; i--) 
		{
			System.out.print(a[i]+" ");
		}
	}
}
