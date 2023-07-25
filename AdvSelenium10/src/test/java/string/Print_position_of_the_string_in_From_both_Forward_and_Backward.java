package string;

import java.util.LinkedHashSet;

public class Print_position_of_the_string_in_From_both_Forward_and_Backward 
{
	public static void main(String[] args) 
	{
		String s = "TESTER";
		s = s.toLowerCase();
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		
		for (int i = 0; i < s.length(); i++) 
		{
			System.out.print(s.charAt(i));
			set.add(s.charAt(i));
		}
		System.out.println("");
		System.out.println("");
		System.out.println("printing position of characters from Forward direction");
		for (Character cha : set) 
		{
			for (int i = 0; i < s.length(); i++) 
			{
				if (cha==s.charAt(i)) 
				{
					System.out.println(cha+" = "+(i+1));
					break;
				}
			}
		}
		System.out.println("");
		System.out.println("printing position of characters from backward direction");
		for (Character cha : set) 
		{
			for (int i = s.length()-1; i >=0 ; i--) 
			{
				if (cha==s.charAt(i)) 
				{
					System.out.println(cha+" = "+(i+1));
					break;
				}
			}
		}
	}
}
