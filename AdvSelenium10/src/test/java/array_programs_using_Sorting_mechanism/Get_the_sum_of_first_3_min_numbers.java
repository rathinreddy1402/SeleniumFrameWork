package array_programs_using_Sorting_mechanism;

public class Get_the_sum_of_first_3_min_numbers 
{
	public static void main(String[] args) 
	{
		int[] a = {50,10,30,40,20};
		
		int count = 3;
		
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = i+1; j < a.length; j++) 
			{
				if (a[i]>a[j]) 
				{
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		
		int sum = 0;
		for (int i = 0; i < count; i++) 
		{
			sum = sum + a[i];
		}
		System.out.println("Sum of first "+count+" minimum numbers ==> "+sum);
		
	}
}
