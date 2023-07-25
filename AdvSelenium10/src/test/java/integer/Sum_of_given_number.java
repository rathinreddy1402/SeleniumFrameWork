package integer;

public class Sum_of_given_number 
{
	public static void main(String[] args) {
		
		int num = 123;
		int numc = num;
		int sum= 0;
		
		while(numc>0)
		{
			int rem = numc%10;
			sum = sum+rem;
			numc = numc/10;
		}
		System.out.println("sum of "+num+" = "+sum);
	}
}
