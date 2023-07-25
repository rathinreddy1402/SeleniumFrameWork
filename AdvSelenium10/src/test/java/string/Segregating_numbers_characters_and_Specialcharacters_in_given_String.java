package string;

public class Segregating_numbers_characters_and_Specialcharacters_in_given_String 
{
	public static void main(String[] args) {
		String s = "shafk5461jdkkf5465#$%^&*";
		
		String alphabets = "" , integer ="", spchar ="";
		
		for (int i = 0; i < s.length(); i++) 
		{
			if (s.charAt(i)>='0' && s.charAt(i)<='9') 
			{
				integer = integer+s.charAt(i);
			}else if (s.charAt(i)>='A' && s.charAt(i)<='Z'|| s.charAt(i)>='a' && s.charAt(i)<='z') 
			{
				alphabets = alphabets+s.charAt(i);
			}else {
				spchar = spchar+s.charAt(i);
			}
		}
		System.out.println(alphabets+" "+integer+" "+spchar);
		
		
	}
}
