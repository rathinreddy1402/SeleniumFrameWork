package string;

import java.util.LinkedHashSet;

public class Print_only_duplicates_in_a_given_sentence 
{
	public static void main(String[] args) {
		String str = "welcome to the to welcome to the testyantra";
		String[] st = str.split(" ");
		LinkedHashSet<String> set = new LinkedHashSet<String>();
		for (String string1 : st) 
		{
			System.out.print(string1+" ");
			set.add(string1);
		}
		System.out.println("");
		System.out.println("");
		System.out.println("printing only the duplicate words");
		for (String string2 : set) 
		{
			int count = 1;
			for (String string3 : st) 
			{
				if (string2.equals(string3)) 
				{
					count++;
				}
			}
			if (count>1) 
			{
				System.out.println(string2);
			}
		}
	}
}
