package string;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class Print_number_of_ovals_present_in_given_String
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a string");
		String s = sc.next();
		char[] sa = s.toCharArray();
		System.out.println("");
		System.out.println("printing count of ovals in the given string");
		int count = 0;
		for (char c : sa) 
		{
			if (c=='a'||c=='e'||c=='i'||c=='o'||c=='u') 
			{
				count++;
				System.out.println(c);
			}
		}
		System.out.println("number of ovals in the given string = "+count);
	
		System.out.println("");
		System.out.println("printing count of unique ovals in the given string");
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		for (int i = 0; i < s.length(); i++) 
		{
			set.add(s.charAt(i));
		}
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
				System.out.println(cha+" = "+count1);
			}
		}
		System.out.println("number of unique  ovals in the given string = "+count2);
	
	}
}
