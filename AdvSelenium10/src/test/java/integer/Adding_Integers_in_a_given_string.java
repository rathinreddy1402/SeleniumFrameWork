package integer;

public class Adding_Integers_in_a_given_string 
{
	public static void main(String[] args) {
		String s = "45hshgf564jv5sd%^764jks548";
		int sum = 0;
		int tsum = 0;
		for (int i = 0; i < s.length(); i++) 
		{
			if (s.charAt(i)>='0' && s.charAt(i)<='9') 
			{
				sum = sum*10+(s.charAt(i)-48);
			}
			else
			{
				tsum = tsum+sum;
				sum = 0;
			}
		}
		System.out.println(tsum+sum);
	}
}
