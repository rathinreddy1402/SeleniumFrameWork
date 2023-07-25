package string;

public class Swap_first_and_last_word_in_a_sentence 
{
	public static void main(String[] args) {
		String str = "welcome to the testyantra";
		String[] st = str.split(" ");
		
		String temp = st[0];
		st[0]=st[st.length-1];
		st[st.length-1] = temp;
		
		for (int i = 0; i < st.length; i++) 
		{
			System.out.print(st[i]+" ");
		}
	}
}
