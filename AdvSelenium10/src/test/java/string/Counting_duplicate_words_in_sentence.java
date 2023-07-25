package string;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Counting_duplicate_words_in_sentence 
{
	public static void main(String[] args) 
	{
		String str = "welcome to the to welcome to the testyantra";
		String[] st = str.split(" ");
		LinkedHashSet<String> set = new LinkedHashSet<String>();
		for (String str1 : st) 
		{
			System.out.print(str1+" ");
			set.add(str1);
		}
		System.out.println("");
		System.out.println("");
		System.out.println("printing count of words in the sentence");		
		for (String str2 : set) 
		{
			int count = 0;
			for (String str3 : st) 
			{
				if (str2.equals(str3)) 
				{
					count++;
				}
			}
			System.out.println(str2+" = "+count);
		}
		
	}
}
