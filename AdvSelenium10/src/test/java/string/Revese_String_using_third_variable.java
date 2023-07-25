package string;

public class Revese_String_using_third_variable 
{
	public static void main(String[] args) {
		String s = "Laptop";
		String rev = "";

		for (int i = s.length()-1; i >=0; i--) 
		{
			rev=rev+s.charAt(i);
			
		}
		
		System.out.println(rev);
	}
}
