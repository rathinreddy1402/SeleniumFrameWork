package string;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Print_ovals_present_in_string
{
	public static void main(String[] args) {
		String s = "testyantra";
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		int count = 0;
		for (int i = 0; i < s.length(); i++) 
		{
			System.out.print(s.charAt(i));
			set.add(s.charAt(i));
		}
		
		System.out.println("");
		System.out.println("");
		System.out.println("printing only ovals in the "+s+"");
		for (int i = 0; i < s.length(); i++) 
		{
			if (s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
			{		
				count++;
				System.out.println(s.charAt(i));
			}
		}
		System.out.println("");

		System.out.println("numbers of ovals = "+ count);
		System.out.println("");
		System.out.println("");

		System.out.println("printing only unique ovals in the "+s+"");
		int count2 = 0;
		for (Character cha : set) 
		{
			int count1 = 0;
			for (int i = 0; i < s.length(); i++) 
			{
				if (cha==s.charAt(i)) {
					count1++;
				}
			}
			if (cha=='a'||cha=='e'||cha=='i'||cha=='o'||cha=='u')
			{
				count2++;
				System.out.println(cha+" , number of occurance = "+count1);
			}
		}
		System.out.println("");
		System.out.println("numbers of unique ovals = "+ count2);

	}
}
