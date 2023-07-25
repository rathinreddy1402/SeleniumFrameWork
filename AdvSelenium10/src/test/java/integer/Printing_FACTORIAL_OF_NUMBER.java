package integer;

public class Printing_FACTORIAL_OF_NUMBER 
{
	public static void main(String[] args) 
	{
		int number = 1;
		int fact = 1;
		
		for (int i = 2; i<=number; i++) 
		{
			fact = fact*i;
		}
		
		System.out.println("factorial of "+number+" = "+fact);
		
	}
}
