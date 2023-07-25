package string;

import java.util.LinkedHashSet;

public class Print_order_of_occurance_of_word_in_a_Sentence 
{
	public static void main(String[] args) {
		String s = "welcome to testyantra - testyantra to welcome ";
		String[] str = s.split(" ");
		LinkedHashSet<String> set = new LinkedHashSet<String>();
		
		System.out.println("Printing position of word in forward direction -  with duplicates");

		for (int i = 0; i < str.length; i++) 
		{
			set.add(str[i]);
			System.out.println(str[i]+" = "+(i+1));
		}
		
		System.out.println("");
		System.out.println("");
		System.out.println("Printing position of word in forward direction - without duplicates");
		for (String string : set) 
		{
			for (int i = 0; i < str.length; i++) 
			{
				if (string.equals(str[i])) {
					System.out.println(string+" = "+(i+1));
					break;
				}
			}
		}
		System.out.println("");
		System.out.println("");
		System.out.println("Printing position of word in backward direction - without duplicates");
		for (String string : set) 
		{
			for (int i = str.length-1; i >=0; i--) 
			{
				if (string.equals(str[i])) {
					System.out.println(string+" = "+(i+1));
					break;
				}
			}
		}
	}
}
