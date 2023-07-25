package integer;

public class Print_sum_of_diagonal_number_in_a_tow_dimentional_array 
{
	public static void main(String[] args) {
		int[][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};

		//int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};

		System.out.println("printing sum of diagonal from left");
		System.out.println();
		int sum = 0;
		for (int i = 0; i < arr.length; i++) 
		{
			sum = sum+arr[i][i];
			System.out.print(arr[i][i]+" ");
		}
		System.out.println();
		System.out.println();
		System.out.println(sum);
		System.out.println("====================================");
		System.out.println("printing sum of diagonal from right ");
		System.out.println();

		int sum1 = 0;
		int k = arr.length-1;
		for (int i = 0; i < arr.length; i++)
		{
			sum1 = sum1 + arr[i][k];
			System.out.print(arr[i][k]+" ");
			k--;
		}
		System.out.println();
		System.out.println();
		System.out.println(sum1);
	}
}
