package string;

public class Check_the_word_is_Palindrome_Not 
{
	public static void main(String[] args) {
		String s = "level";
		String rev = "";
		for (int i = s.length()-1; i >= 0 ; i--) 
		{
			rev=rev+s.charAt(i);
		}
		
		if (s.equals(rev)) 
		{
			System.out.println(s+" --> is a palindrome number");
		}else {
			System.out.println(s+" --> is not a palindrome number");
		}
	}
}
