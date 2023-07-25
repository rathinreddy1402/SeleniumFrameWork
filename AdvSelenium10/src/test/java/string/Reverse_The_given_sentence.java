package string;

public class Reverse_The_given_sentence 
{
	public static void main(String[] args) {
		String str = "welcome to testyantra";
		
		String[] st = str.split(" ");
		for (int i = st.length-1; i >=0 ; i--) 
		{
			System.out.print(st[i]+" ");
		}
		System.out.println(" ");
		for (int i = 0; i < st.length; i++)
		{
			System.out.print(st[i]);
		}
	}
}
