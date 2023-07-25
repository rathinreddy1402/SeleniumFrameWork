package string;

public class Print_String_with_maximum_length {

	public static void main(String[] args) {
		
		String[] s = {"88888888","55555","88888888","4444","3333","666666"};
		
		String max_length = s[0];
		
		for (int i = 0; i < s.length; i++) 
		{
			if (s[i].length()>max_length.length()) 
			{
				max_length = s[i];
			}
		}
		
		for (int i = 0; i < s.length; i++) 
		{
			if (s[i].length()==max_length.length()) 
			{
				
				System.out.println(s[i]);

			}
		}
	}

}
