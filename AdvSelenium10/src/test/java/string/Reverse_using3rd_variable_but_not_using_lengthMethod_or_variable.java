package string;

public class Reverse_using3rd_variable_but_not_using_lengthMethod_or_variable 
{
	public static void main(String[] args) 
	{
		
		String s = "Laptop";
		String rev = "";
		String[] s1 = s.split("");
		int count = 0;
		for (String string : s1) 
		{
			count++;
			
		}
		
		for (int i = count-1; i >=0; i--) 
		{
			rev=rev+s.charAt(i);
		}
		System.out.println(rev);
	}
}
