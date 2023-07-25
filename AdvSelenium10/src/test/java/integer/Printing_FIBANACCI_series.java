package integer;

public class Printing_FIBANACCI_series 
{
	public static void main(String[] args) 
	{
		int limit = 8;
		int fib1 = 0;
		int fib2 = 1;
		
		System.out.println("Printing first "+limit+" fibanacci numbers ");
		System.out.println("");

		for (int i = 0; i < limit; i++)
		{
			System.out.print(fib1+" ");
			int fib3 = fib1+fib2;
			fib1 = fib2;
			fib2 = fib3;
		}
		System.out.println("");
		System.out.println("");
		System.out.println("===============================================");
		System.out.println("");


		int range = 200;
		int first = 0;
		int second = 1;
		
		System.out.println("Printing fibanacci numbers with in "+range+" ");
		System.out.println("");

		while(first<range)
		{
			System.out.print(first+" ");
			int next = first+second;
			first = second;
			second = next;
		}
		
		
	}
}
