package string;

import java.util.LinkedHashSet;

public class Remove_duplicate_characters_in_a_string 
{
	public static void main(String[] args) 
	{
		String s = "TESTYANTRA";
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		for (int i = 0; i < s.length(); i++) 
		{
			System.out.print(s.charAt(i));
			set.add(s.charAt(i));
		}
		System.out.println("");
		System.out.println("");

		System.out.println("printing without duplicate characters");

		for (Character character : set)
		{
		    System.out.print(character);
		}
		System.out.println("");
		System.out.println("");


		System.out.println("printing unique characters with count");
		for (Character character : set) 
		{
			int count = 0;
			for (int i = 0; i < s.length(); i++) 
			{
				if (character==s.charAt(i)) 
				{
					count++;
				}
			}
				System.out.println(character+" = "+count);
		}
	}
}
