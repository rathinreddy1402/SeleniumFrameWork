package string;
public class Print_order_of_occurance_of_string 
{
	public static void main(String[] args) 
	{
		String s = "aabbca";
		int j=0;
		boolean flag = true;
		while (flag)
		{
		for (char l = 'a'; l <= 'z' ; l++) 
		{
			int count =0;
			for (int i = j; i < s.length(); i++) 
			{
				if (s.charAt(i)==l) 
				{
					count++;
					if (i==s.length()-1)
					{
						flag=false;
					}
				}else 
				{
					j=i;
					break;
				}
			}
			if (count>0) 
			{
				System.out.print(l+""+count);
			}
		}
		}
	}
}
