package string;

import java.util.LinkedHashSet;

public class Print_only_duplicate_values_in_a_string 
{
	public static void main(String[] args) 
	{
		String s= "TESTYANTRA";
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		
		for (int i = 0; i < s.length(); i++) 
		{
			System.out.print(s.charAt(i));
			set.add(s.charAt(i));
		}
		System.out.println("");
		System.out.println("");
		System.out.println("printing only duplicate characters");
		for (Character cha : set) 
		{
			int count=0;
			for (int i = 0; i < s.length(); i++) 
			{
				if (cha==s.charAt(i)) 
				{
					count++;
				}
			}
			if (count>1) 
			{
				System.out.println(cha);
			}
		}
		
	}
}
