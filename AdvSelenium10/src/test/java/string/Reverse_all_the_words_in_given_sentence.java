package string;

public class Reverse_all_the_words_in_given_sentence 
{
	public static void main(String[] args) 
	{
		String str = "welcome to testyantra";
		String[] st = str.split(" ");
		for (int i = 0; i < st.length; i++) 
		{
			String s = st[i];
			for (int j = s.length()-1; j >=0 ; j--) 
			{
				System.out.print(s.charAt(j));
			}
			System.out.print(" ");
		}
	}
}
