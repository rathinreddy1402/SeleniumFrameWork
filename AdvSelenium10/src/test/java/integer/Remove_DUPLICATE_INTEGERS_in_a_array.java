package integer;

import java.util.LinkedHashSet;

public class Remove_DUPLICATE_INTEGERS_in_a_array 
{
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,6,4,5,2,7,8,9};
		
		LinkedHashSet<Integer> set = new LinkedHashSet<Integer>(); 
		
		for (int i = 0; i < arr.length; i++) 
		{
			System.out.print(arr[i]);
			set.add(arr[i]);
		}
		System.out.println("");
		System.out.println("");
		System.out.println("printing without duplicate integers");
		for (Integer in : set) 
		{
			int count=0;
			for (int i = 0; i < arr.length; i++) 
			{
				if (in==arr[i]) 
				{
					count++;
				}
			}
			System.out.println(in+" ,count = "+count);
		}
	}
}
