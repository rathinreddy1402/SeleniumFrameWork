package integer;

public class Adding_all_the_NUMBERS_In_a_STRING 
{
	public static void main(String[] args) {
		String s = "sd65sa8c2";
		int sum = 0;
		for (int i = 0; i < s.length(); i++) 
		{
			if (s.charAt(i)>='0' && s.charAt(i)<='9')
			{
				int n = s.charAt(i)-48;
				sum=sum+n;
			}
		}
		System.out.println("sum of all the numbers in the given string = "+sum);
	}
}
