package array_programs_using_Sorting_mechanism;

public class Get_the_sum_of_first_3_max_numbers 
{
	public static void main(String[] args) 
	{
		int count = 3;
		int[] a = {10,50,30,40,20};
		
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = i+1; j < a.length; j++) 
			{
				if (a[i]<a[j]) 
				{
					int temp = a[i];
					a[i] = a[j];
					a[j]= temp;
				}
			}
		}
		
		int sum =0;
		for (int i = 0; i < count; i++) 
		{
			sum = sum+a[i];
		}
		System.out.println("Sum of first "+count+" maximum numbers ==> "+sum);

	}
}
