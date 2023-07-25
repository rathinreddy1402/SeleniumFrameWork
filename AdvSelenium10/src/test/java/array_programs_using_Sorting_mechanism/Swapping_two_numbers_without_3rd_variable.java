package array_programs_using_Sorting_mechanism;

public class Swapping_two_numbers_without_3rd_variable {

	public static void main(String[] args) 
	{
		
		int a = 5;
		int b = 7;
		
		System.out.println("value of a = "+a);
		System.out.println("value of b = "+b);
		
		a = a+b; // 5+7 = 12
		b = a-b; // 12-7 = 5
		a = a-b; // 12-5 = 7
		System.out.println("swapping a and b");
		System.out.println("value of a = "+a);
		System.out.println("value of b = "+b);
	}

}
