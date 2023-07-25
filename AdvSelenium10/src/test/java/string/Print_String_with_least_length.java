package string;

public class Print_String_with_least_length 
{
	public static void main(String[] args) {
		
		String[] s = {"88888888","55555","4444","333","666666"};
		
		String Least_length=s[0];
		
		for (int i = 0; i < s.length; i++) 
		{
			if (s[i].length()<Least_length.length()) 
			{
				Least_length = s[i];
			}
		}
		
		for (int i = 0; i < s.length; i++) 
		{
			if (s[i].length()==Least_length.length()) 
			{
				System.out.println(s[i]);

			}
		}
		
	}
}
