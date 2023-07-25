package string;

import java.util.ArrayList;

public class Revese_a_String_without_length_method
{
	public static void main(String[] args) {
		
		String s = "Laptop";
		//char[] s1 = s.toCharArray();
		String[] s1 = s.split("");
		int count = 0;
		for (String string : s1) 
		{
			count++;
			
		}
		
		for (int i = count-1; i >=0; i--) 
		{
			System.out.print(s.charAt(i)+" ");
		}
	
		
		

	}
}
