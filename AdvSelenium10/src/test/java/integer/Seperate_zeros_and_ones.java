package integer;

public class Seperate_zeros_and_ones 
{
	public static void main(String[] args) 
	{
		
		int[] arr = {0,1,0,1,0,1,0,1,0,1,0};
		int[] arr1 = new int[arr.length];
		
		int m = 0, n = arr.length-1;
		
		for (int i = 0; i < arr.length; i++) 
		{
			if (arr[i]==1) 
			{
				arr1[m] = arr[i];
				m++;
				
			}else{
				arr1[n]=arr[i];
				n--;
		}
		}
		
		for (int i = 0; i < arr1.length; i++) 
		{
			System.out.print(arr1[i]+" ");
		}
	}
}
