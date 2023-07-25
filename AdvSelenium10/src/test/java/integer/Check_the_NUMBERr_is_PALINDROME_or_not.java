package integer;

public class Check_the_NUMBERr_is_PALINDROME_or_not 
{
	public static void main(String[] args) 
	{
		int num = 123454321;
		int num1 = num;
		int rev = 0;
		
		while(num>0)
		{
			int rem = num%10;
			rev = rev*10 + rem;
			num = num/10;
		}
		if (num1==rev) 
		{
			System.out.println(num1+" --> is a palindrome number");
		}else {
			System.out.println(num1+" --> is not a palindrome number");
		}
		
	
	}
}
