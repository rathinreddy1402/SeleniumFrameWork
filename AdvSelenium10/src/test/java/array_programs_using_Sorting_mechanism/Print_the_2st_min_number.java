package array_programs_using_Sorting_mechanism;

public class Print_the_2st_min_number {

	public static void main(String[] args) 
	{
		int[] a = {50,20,30,40,10};
		
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = i+1; j < a.length; j++) 
			{
				if (a[i]>a[j]) 
				{
					int temp = a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("Second minimum number ==> "+a[1]);

	}

}
