package string;

public class Reverse_a_String 
{
	public static void main(String[] args) {
		String s = "Laptop";
		
		for (int i = s.length()-1; i >=0; i--) 
		{
			System.out.print(s.charAt(i)+" ");
		}
	}
}
